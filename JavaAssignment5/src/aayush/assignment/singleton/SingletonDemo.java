package aayush.assignment.singleton;

public class SingletonDemo {
    public  String str;
    public static SingletonDemo init(String st){
        str=st;
        return new SingletonDemo();
    }
    public void print(){
        System.out.println(str);
    }
    //non-static variable str cannot be referenced from a static context
}
