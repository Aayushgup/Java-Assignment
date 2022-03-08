package com.company;

public class Main{
    public static void main(String[] args) {
        System.out.println("Demonstrating SListIterator...");
        SList<String> sl = new SList<String>();
        System.out.println(sl);
        SList.SListIterator<Integer> slit = sl.iterator();
        slit.add(1);
        slit.add(2);
        slit.add(2);
        System.out.println(slit.hasNext());
        System.out.println(sl);


    }
    }
}
