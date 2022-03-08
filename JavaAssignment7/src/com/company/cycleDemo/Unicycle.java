package com.company.cycleDemo;

public class Unicycle implements CycleInterface   {
    @Override
    public void ride() {
        System.out.println("Riding Unicycle");
    }

    @Override
    public int wheel() {
        return 1;
    }
}
