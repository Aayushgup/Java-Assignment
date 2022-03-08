package com.company;
import java.lang.*;

public class ExceptionHandling {
    public static void main(String[] args) {

        try {
            exceptionMethod();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            System.out.println("Final Block is executed");
        }
    }


//exception method definition
    public static void exceptionMethod() throws Exception1, Exception2, Exception3 {

        int num = 12;
        try {
            if (num < 200) {
                throw new Exception1();
            } else if (num % 2 != 0) {
                throw new Exception2();
            } else {
                throw new Exception3();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class Exception1 extends Exception {
    public String toString() {
        return "Exception1 is Thrown";
    }
}

class Exception2 extends Exception {
    public String toString() {
        return "Exception2  is Thrown";
    }
}

class Exception3 extends Exception {
    public String toString() {
        return "Exception3 is Thrown";
    }
}
