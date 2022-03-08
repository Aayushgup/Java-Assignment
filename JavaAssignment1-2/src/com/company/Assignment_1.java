package com.company;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment_1 {

    public static void checkFileMatch()
    {     File homeDirectory=new File("/home/ayushk/Home_dir");
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the file name to match or Enter exit :");
            String input = sc.nextLine();
            if(input.equals("exit"))
                return;
            Pattern pattern = Pattern.compile(input);
           File files[]=homeDirectory.listFiles();
           for(File f:files)
           {
               Matcher m=pattern.matcher(f.getName());
               if(m.find())
                   System.out.println(f.getAbsolutePath());
           }
        }
    }
     // main
    public static void main(String[] args) {
        checkFileMatch();
    }
}
