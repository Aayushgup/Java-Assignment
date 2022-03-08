package com.company;

public class Rodent {
    public Rodent(){
        System.out.println("this is base rodent class");
    }

    public void hasTail(){
        System.out.println("all rodents have tails");
    }
    public void hasEars(){
        System.out.println("all rodents have ears");
    }
}
class Mouse extends Rodent{
    public Mouse(){
        System.out.println("this is mouse constructor");
    }
    public void hasTail(){
        System.out.println("mouses have long tails");
    }

    @Override
    public void hasEars() {
        System.out.println("mouses have big and round ears");
    }
}
class Gerbil extends Rodent{

    public Gerbil(){
        System.out.println("this is gerbil constructor");
    }
    @Override
    public void hasTail() {
        System.out.println("Gerbils have fatter and furrier tails");
    }

    @Override
    public void hasEars() {
        System.out.println("Gerbils have mid sized tails");
    }
}
class Hamster extends Rodent{

    public Hamster(){
        System.out.println("this is hamster constructor");
    }
    @Override
    public void hasTail() {
        System.out.println("Hamsters have only one inch tails");
    }

    @Override
    public void hasEars() {
        System.out.println("mouses have small ears");
    }
}
