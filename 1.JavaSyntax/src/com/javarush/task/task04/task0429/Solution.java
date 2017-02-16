package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());



        int counta =0;
        int countb =0;
        if(a>0) {
            counta++;
        } else if(a<0) {
            countb++;
        }
        if(b>0) {
            counta++;
        } else if(b<0) {
            countb++;
        }
        if(c>0) {
            counta++;
        } else if(c<0) {
            countb++;
        }
        System.out.println("количество отрицательных чисел: " + countb);
        System.out.println("количество положительных чисел: " + counta);
        }
    }

