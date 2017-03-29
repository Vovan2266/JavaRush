package com.javarush.task.task04.task0424;

/* 
Три числа
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
        if(a == b && c != a)
            n = 3;
        if(a == c && b != a)
            n = 2;
        if( b == c && a != b)
            n = 1;
        System.out.println(n);
    }
}
