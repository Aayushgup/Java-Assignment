package com.company;

public class Cycle {
    public void balance(){
        System.out.println("balance method in cycle");
    }
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("balance method in Unicycle");
    }

}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("balance method in Bicycle");
    }
}
class Tricycle extends Cycle{

}
class Main{
    public static void main(String[] args){
        Cycle[] cycle=new Cycle[4];
        //upcast
        cycle[0]=new Cycle();
        cycle[1]=new Unicycle();
        cycle[2]=new Bicycle();
        cycle[3]=new Tricycle();

        cycle[1].balance();
        //Downcast
        Unicycle unicycle= (Unicycle)cycle[1];
        unicycle.balance();
        //Downcast
        Tricycle tricycle=(Tricycle)cycle[3];
        tricycle.balance();// will access the balance method of base class



    }
}
