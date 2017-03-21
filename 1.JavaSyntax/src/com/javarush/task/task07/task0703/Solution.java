package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mas [] = new String[10];
        int mas1 [] = new int[10];
        for(int i = 0; i < 10; i++){
            String s = reader.readLine();
            mas[i] = s;
        }
        for (int j = 0; j < 10; j++) {
            int numb = mas[j].length();
            System.out.println(numb);
        }
    }
}
