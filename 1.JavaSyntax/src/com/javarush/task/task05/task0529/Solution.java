package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int i = 0;

        while(true){
            String n = reader.readLine();

            if(n.equals("сумма"))
                break;

            int s = Integer.parseInt(n);
            i=i+s;
        }
        System.out.println(i);
    }


    }
