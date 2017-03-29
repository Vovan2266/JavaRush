package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] mas = new String[10];
        for (int i = 0; i < 8; i++)
        {
            String s = reader.readLine();
            mas[i] = s;
        }
        for (int i = 0; i < mas.length; i++)
        {
            int j = mas.length - i - 1;
            System.out.println( mas[j] );
        }
    }
}
