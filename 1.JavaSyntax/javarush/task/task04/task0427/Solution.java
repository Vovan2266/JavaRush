package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int a = Integer.parseInt(num);
        int b = num.length();
        if(a > 0 && a < 1000){
            String res = "четное" + " ";
            if(a%2 != 0)
                res = "нечетное" + " ";
            System.out.print(res);
            res = "однозначное число";
            if(b == 2)
                res = "двузначное число";
            if(b == 3)
                res = "трехзначное число";
            System.out.println(res);
        }
        }
    }

