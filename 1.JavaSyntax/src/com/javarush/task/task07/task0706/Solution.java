package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a1 = 0,a2 = 0;
        int []arr = new int[15];

        for(int i = 0; i< 15; i++){
            arr[i]=Integer.parseInt(reader.readLine());
            if(i % 2 == 0)
                a2 += arr[i];
            else a1 += arr[i];
        }

        if(a1 > a2)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");

        else System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}


