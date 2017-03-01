package com.javarush.task.task07.task0703;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];
        int[] list = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
            list[i] = array.length;

        }

            System.out.println(list.length);
        }
    }

