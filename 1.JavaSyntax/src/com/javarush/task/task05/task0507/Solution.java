package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        while (true){
            double a = Double.parseDouble(reader.readLine());
            if(a == -1){
                break;
            }
            sum += a;
            count++;
        }
        System.out.println(sum / count);

    }
}
