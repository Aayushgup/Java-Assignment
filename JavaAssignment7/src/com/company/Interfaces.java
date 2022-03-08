package com.company;

interface Interface1 {
    void method1();
    void method2();
}

interface Interface2 {
    void method3();
    void method4();
}
interface Interface3 {
    void method5();
    void method6();
}
interface newInterface extends Interface1,Interface2,Interface3{
    void newMethod();
}
class Concrete{
    Concrete(){
        System.out.println("Constructor in Concrete Class");
    }
}
class NewClass extends Concrete implements newInterface {

    @Override
    public void method1() {
        System.out.println("this is method1");
    }

    @Override
    public void method2() {
        System.out.println("this is method2");
    }

    @Override
    public void method3() {
        System.out.println("this is method3");
    }

    @Override
    public void method4() {
        System.out.println("this is method4");
    }

    @Override
    public void method5() {
        System.out.println("this is method5");
    }

    @Override
    public void method6() {
        System.out.println("this is method6");
    }

    @Override
    public void newMethod() {
        System.out.println("this is new method");
    }
   // first method similarly for all other interface 2 3
    void firstInterface(Interface1 obj){
        obj.method1();
        obj.method2();
    }
    void newInterface(newInterface obj)
    {
        obj.newMethod();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();

    }

}
public class Interfaces{
    public static void main(String[] args){
        NewClass obj=new NewClass();
        obj.method1();
        obj.newInterface(obj);
    }
}
