package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = 0;
        if(a > 0 && b > 0)
            c = 1;
        if (a < 0 && b > 0)
            c = 2;
        if(a < 0 && b < 0)
            c = 3;
        if (a > 0 && b < 0)
            c = 4;
        System.out.println(c);
    }
}
