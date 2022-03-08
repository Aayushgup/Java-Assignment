package com.company.cycleDemo;

public class CycleFactory {

    public CycleInterface getCycle(String str){
        if(str.equals("1"))
            return new Unicycle();
        else if(str.equals("2"))
            return new Bicycle();
        else
            return new Tricycle();
    }

    public static void main(String[] args) {
        CycleFactory cf=new CycleFactory();
        Bicycle hero= (Bicycle) cf.getCycle("2");
        hero.ride();
        System.out.println("Wheel is : "+ hero.wheel());
    }

}

