package com.company;

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input String: ");
        String input=sc.nextLine();
         if(checkAllAlphabets(input))
             System.out.println("All letter of alphabets are Present in String .");
         else
             System.out.println("Not Present.");
    }
    public static boolean checkAllAlphabets(String input)
    {
        int index=0;
        boolean visited[]=new boolean[26];
        for (int i=0;i<input.length();i++) {
            if (input.charAt(i)>='a' && input.charAt(i) <='z') {
                index = input.charAt(i)-'a';
                visited[index]=true;
            } else if (input.charAt(i)>='A' && input.charAt(i) <='Z') {
                index = input.charAt(i)-'A';
                visited[index]=true;
            }

        }
       // Time complexity O(26+N)
        // Space Complexity O(26)
        for (int i=0;i<26;i++) {
            if (visited[i]!=true) {
                return false;
            }
        }
        return true;
    }
}
