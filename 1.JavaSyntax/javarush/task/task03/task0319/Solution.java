package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        System.out.println(a + " получает " + b + " через " + c + " лет.");
    }
}
