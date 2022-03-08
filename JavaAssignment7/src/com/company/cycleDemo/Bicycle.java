package com.company.cycleDemo;


public class Bicycle implements CycleInterface{
    @Override
    public void ride() {
        System.out.println("Riding Bicycle");
    }

    @Override
    public int wheel() {
        return 2;
    }
}
