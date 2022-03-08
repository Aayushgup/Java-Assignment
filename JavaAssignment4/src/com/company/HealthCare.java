package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class HealthCare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while( n >0){
            String[] signedDate=sc.next().split("-");
            String[] currDate=sc.next().split("-");
            int signedDay=Integer.parseInt(signedDate[0]);
            int signedMonth=Integer.parseInt(signedDate[1]);
            int signedYear=Integer.parseInt(signedDate[2]);
            int currDay=Integer.parseInt(currDate[0]);
            int currMonth=Integer.parseInt(currDate[1]);
            int currYear=Integer.parseInt(currDate[2]);

            GregorianCalendar GSignedDate=new GregorianCalendar(signedYear,signedMonth-1,signedDay);
            GregorianCalendar GCurrentDate=new GregorianCalendar(currYear,currMonth-1,currDay);

            if(GCurrentDate.after(GSignedDate)){
                GregorianCalendar start=new GregorianCalendar(currYear,signedMonth-1,signedDay);
                GregorianCalendar end=new GregorianCalendar(currYear,signedMonth-1,signedDay);

                start.add(Calendar.DATE,-30);
                end.add(Calendar.DATE,+30);

                printDate(start);
                if(GCurrentDate.before(end))
                    printDate(GCurrentDate);
                else
                    printDate(end);
                System.out.println();
            }
            else
                System.out.println("No Range");
            n--;
        }
    }

    public static void printDate(GregorianCalendar cal){
        int date,month,year;
        date=cal.get(Calendar.DATE);
        month=cal.get(Calendar.MONTH)+1;
        year=cal.get(Calendar.YEAR);
        //System.out.println(date+" "+month+" "+year);
        if(date/10 == 0){
            System.out.print("0"+date);
        }
        else
            System.out.print(date);
        System.out.print("-");
        if(month/10 ==0)
            System.out.print("0"+month);
        else
            System.out.print(month);
        System.out.print("-");
        System.out.print(year+" ");
    }
}
