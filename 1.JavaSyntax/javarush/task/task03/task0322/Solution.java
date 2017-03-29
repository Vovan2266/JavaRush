package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        System.out.println(a + " + " + b  + " + " + c + " = Чистая любовь, да-да!");
    }
}