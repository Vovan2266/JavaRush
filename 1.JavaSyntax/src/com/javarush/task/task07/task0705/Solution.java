package com.javarush.task.task07.task0705;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] list1 = new int[10];
        int[] list2 = new int[10];

        for (int i = 0; i < 20; i++){
            list[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i < 10; i++){
            list1[i] = list[i];
            list2[i] = list[i + 10];
            System.out.println(list2[i]);
        }

    }

}