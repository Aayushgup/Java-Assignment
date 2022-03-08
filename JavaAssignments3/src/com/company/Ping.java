package com.company;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;

public class Ping
{
    public static int pingHost(String host) throws IOException
    {
        long start=System.currentTimeMillis();
        System.out.println("the start time is "+ start);
        if(InetAddress.getByName(host).isReachable(100)){
            return 5;
        }

        long current=System.currentTimeMillis();
        System.out.println("the current time is "+ current);
        long diff=current-start;
        return(int)(diff);
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println("Time required to reach Host "+pingHost("123.50.50.50"));
        ArrayList<Integer> array = new ArrayList<>();
        int n=0;
        while(n<5){
            int input=pingHost("133.192.31.42");
            System.out.println(input);
            array.add(input);
            n++;
            System.out.println();
        }
        Collections.sort(array);
        System.out.println("Median of time taken :"+array.get(2));

    }
}
