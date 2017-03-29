package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; ; i++) {
            int a = Integer.parseInt(reader.readLine());
            sum = a + sum;

            if (a == -1) {
                System.out.println(sum);
                break;
            }
        }
    }

}


