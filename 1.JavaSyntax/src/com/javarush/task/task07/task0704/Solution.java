package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mas[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int s = Integer.parseInt(reader.readLine());
            mas[i] = s;
        }
        for (int i = 0; i < mas.length; i++)
        {
        int j = mas.length - i - 1;
        System.out.println(mas[j]);
        }
    }
}


