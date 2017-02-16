package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        int count = 0;
        int sum = 0;
        while (true)
        {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1)
            {
                double average = (double) sum / count;
                System.out.println(average);
                break; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!выход из цикла
            }
            else
            {
                sum = sum + n;
                count = count + 1;
            }
        }
    }
}






