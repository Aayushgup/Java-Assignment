package aayush.assignment.main;

import aayush.assignment.data.Data;
import aayush.assignment.singleton.SingletonDemo;

public class Main {
    public static void main(String[] args) {
        Data newData=new Data();
        newData.printInfo();
        newData.printLocal();
        SingletonDemo newDemo=new SingletonDemo();
        newDemo.print();
    }
}
