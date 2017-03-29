package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(double i) {
        i = i + i / 10;
        return i;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(125));
    }
}
