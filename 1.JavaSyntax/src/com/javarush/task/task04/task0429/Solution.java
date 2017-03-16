package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int i = 0;
        int j = 0;
        if(a > 0 && b > 0 && c > 0)
            i = 3;
        if(a > 0 && b > 0 && c < 0|| a > 0 && c > 0 && b < 0|| b > 0 && c > 0 && a < 0)
            i = 2;
        if(a > 0 && b < 0 && c < 0 || b > 0 && a < 0 && c < 0 || c > 0 && b < 0 && a < 0)
            i = 1;

        if(a < 0 && b < 0 && c < 0)
            j = 3;
        if(a > 0 && b > 0 && c < 0|| a > 0 && c > 0 && b < 0|| b > 0 && c > 0 && a < 0)
            j = 1;
        if(a > 0 && b < 0 && c < 0 || b > 0 && a < 0 && c < 0 || c > 0 && b < 0 && a < 0)
            j = 2;

        System.out.println("количество отрицательных чисел: " + j);
        System.out.println("количество положительных чисел: " + i);

    }
}
