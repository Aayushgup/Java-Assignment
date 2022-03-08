package com.company.cycleDemo;

public class Tricycle implements CycleInterface{
    @Override
    public void ride() {
        System.out.println("Riding Tricycle");
    }

    @Override
    public int wheel() {
        return 3;
    }
}
