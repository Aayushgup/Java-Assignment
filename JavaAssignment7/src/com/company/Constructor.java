package com.company;

public class Constructor {
    public static class Inner1{
        Inner1(int num)
        {
            System.out.println("value is : "+num);
        }
    }
}
class secondClass{
    static class Inner2 extends Constructor.Inner1{
        Inner2(int num)
        {
            super(num);
        }
    }
}
