package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        int a = Integer.parseInt(a1);
        boolean b = (a%2==0);
        if ((a>=1) && (a<=999)) {
            if (b && a1.length() == 1) {
                System.out.print("четное однозначное число");
            }
        }
        if (!b && a1.length()==1) {
            System.out.print("нечетное однозначное число");
        }
        if (b && a1.length()==2) {
            System.out.print("четное двузначное число");
        }
        if (!b && a1.length()==2) {
            System.out.print("нечетное двузначное число");
        }
        if (b && a1.length()==3) {
            System.out.print("четное трехзначное число");
        }
        if (!b && a1.length()==3) {
            System.out.print("нечетное трехзначное число");
        }
        }

       


    }
