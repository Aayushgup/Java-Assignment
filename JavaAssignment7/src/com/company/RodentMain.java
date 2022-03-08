package com.company;

public class RodentMain {
    public static void main(String[] args) {
        Rodent[] rodent=new Rodent[3];
        rodent[0]=new Mouse();
        rodent[0].hasEars();
        rodent[0].hasTail();

        System.out.println();
        rodent[1]=new Gerbil();
        rodent[1].hasEars();
        rodent[1].hasTail();
        System.out.println();

        rodent[2]=new Hamster();
        rodent[2].hasEars();
        rodent[2].hasTail();

    }
}
