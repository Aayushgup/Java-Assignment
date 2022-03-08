package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class VampireNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number of vampire numbers u want to print?");
        Scanner s=new Scanner(System.in);
        int input=s.nextInt();
        int count=0;
        long i=1;
        while(count<input){

            if(noOfDigits(i)%2==0){

                if(checkVampire(i)){
                    count++;
                    System.out.println(i);
                }

            }
            i+=1;
        }
        System.out.println(checkVampire(120600));

    }

    public static int noOfDigits(long num) {
        int count = 0;
        for (long i = num; i > 0; i = i / 10) {
            count = count + 1;
        }
        return count;
    }

    public static boolean trailingZeroes(long num) {
        if (num % 10 == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkNum(long a, long b) {
        String s1 = String.valueOf(a);
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);

        String s2 = String.valueOf(b);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);

        return (Arrays.equals(c1, c2));
    }

    public static boolean checkVampire(long num) {
        int c = noOfDigits(num);

        boolean b = false;
        for (long i = (long) Math.pow(10, c / 2 - 1); i < (long) Math.pow(10, c / 2); i++) {

            if (num % i == 0) {
                long j = num / i;
                if (j >= (long) Math.pow(10, c / 2 - 1) && j <= (long) Math.pow(10, c / 2)) {
                    if(!(trailingZeroes(i) &&trailingZeroes(j))){
                        b = checkNum(num, (i * (long) Math.pow(10, c / 2)) + j);
                        if(b){
                            return true;
                        }
                    }

                }
            }

        }
        return b;

    }
}
