package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int n = 0;
        if (a > 0 && b > 0 && c > 0)
            n = 3;
        if (a > 0 && b > 0 && c < 0 || a > 0 && c > 0 && b < 0 || a < 0 && b > 0 && c > 0)
            n = 2;
        if(a > 0 && b < 0 && c < 0 || b > 0 && a < 0 && c < 0 || c > 0 && a < 0 && b < 0)
            n = 1;
        if(a < 0 && b < 0 && c < 0)
            n = 0;

        System.out.println(n);

    }
}
