package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        boolean check= Pattern.matches("[A-Z]{1}[a-zA-Z0-9\\s.]*[.]",str);
        if(check){
            System.out.println("Yes, sentence starts with a capital letter and ends with a period.");
        }
        else{
            System.out.println("NO, sentence doesn't start with a capital letter and end with a period.");
        }
    }

}
