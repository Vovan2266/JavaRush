package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int i;
        for (i = 0; i < a.length(); i++)
            i = a.length();
        int j;
        for (j = 0; j < b.length(); j++)
            j = b.length();
        if (i == j) System.out.println("Длины имен равны");
        if (a.equals(b))
            System.out.println("Имена идентичны");




    }
}
