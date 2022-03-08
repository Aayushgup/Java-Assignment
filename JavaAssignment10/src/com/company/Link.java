package com.company;

public class Link<T> {
    T data;
    Link<T> next;
    Link(T data,Link<T>next)
    {
        this.data=data;
        this.next=next;
    }
}
