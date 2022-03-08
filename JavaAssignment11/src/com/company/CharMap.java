package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharMap {
    public static void main(String[] args) {
        try {
            File infile = new File("/home/ayushk/IdeaProjects/JavaAssignment11/aa.txt");
            //BufferedReader br = new BufferedReader(new FileReader(infile));

            Map<Character, Integer> m = new HashMap<Character, Integer>();
            Scanner input = new Scanner(infile);

            while (input.hasNextLine()) {
                String currLine = input.nextLine();
                int size = currLine.length();

                for (int i = 0; i < size; i++) {
                    if (currLine.charAt(i) != ' ') {
                        char c = currLine.charAt(i);
                        if (m.containsKey(c)) {
                            m.put(c, m.get(c) + 1);
                        } else {
                            m.put(c, 1);
                        }
                    } else {
                        continue;
                    }
                }
            }
            PrintWriter pw = new PrintWriter("output.txt");
            for (Character name : m.keySet()) {
                String key = name.toString();
                String value = m.get(name).toString();
                pw.print(key);
                pw.print(" ");
                pw.println(value);

            }
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
