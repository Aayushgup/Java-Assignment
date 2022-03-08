package com.company;

import java.util.NoSuchElementException;

public class SList <T>{
    private  final Link<T> header = new Link<T>(null, null);
    SList() { header.next = header; }
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("[");
        for(SListIterator<T> it = iterator(); it.hasNext();) {
            T element = it.next();
            buf.append(element == this ? "(this SList)" :
                    String.valueOf(element));
            if(it.hasNext())
                buf.append(", ");
        }
        buf.append("]");
        return buf.toString();
    }
    public SListIterator<T> iterator() {
        return new SListIterator();
    }

    public class SListIterator<T> {
        private Link<T> lastReturned = (Link<T>) header;
        private Link<T> next;
        SListIterator() { next = (Link<T>) header.next; }
        public boolean hasNext() { return next != header; }
        public T next() {
            if(next == header)
                throw new NoSuchElementException();
            lastReturned = next;
            next = next.next;
            return lastReturned.data;
        }
        public void remove() {
            if(lastReturned == header)
                throw new IllegalStateException();
            // Find an element before the last returned one
            for(Link<T> curr = (Link<T>) header; ; curr = curr.next)
                if(curr.next == lastReturned) {
                    curr.next = lastReturned.next;
                    break;
                }
            lastReturned = (Link<T>) header;
        }
        public void add(T element) {
            lastReturned = (Link<T>) header;
            Link<T> newLink = new Link<T>(element, next);
            if(header.next == header)   // Empty list
            { Link<T> HH= (Link<T>) header.next;
                HH= newLink;
            }
            else {
                // Find an element before the one pointed by 'next'
                for(Link<T> curr = (Link<T>) header; ; curr = curr.next)
                    if(curr.next == next) {
                        curr.next = newLink;
                        break;
                    }
            }
        }
    }
}
