package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mas [] = new int[20];
        int mas1 [] = new int[10];
        int mas2 [] = new int[10];
        for(int i = 0; i < 20; i++){
            int a = Integer.parseInt(reader.readLine());
            mas[i] = a;
        }
        for(int i = 0; i < mas1.length; i++){
            mas1[i] = mas[i];
        }
        for(int i = 0; i < mas2.length; i++) {
            mas2[i] = mas[i + 10];

            System.out.println(mas2[i]);
        }
    }
}
