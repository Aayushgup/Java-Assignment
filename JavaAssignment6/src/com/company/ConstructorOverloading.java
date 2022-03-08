package com.company;

public class ConstructorOverloading {
    int a,b;
    ConstructorOverloading(int a){
        this(a,0);
    }
    ConstructorOverloading(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        ConstructorOverloading obj1=new ConstructorOverloading(2);
        ConstructorOverloading obj2=new ConstructorOverloading(2,3);
        obj1.display();
        obj2.display();
    }
}