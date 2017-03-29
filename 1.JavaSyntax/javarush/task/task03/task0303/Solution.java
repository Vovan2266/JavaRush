package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(convertEurToUsd(60, 1.1));
        System.out.println(convertEurToUsd(61, 1.0));
    }

    public static double convertEurToUsd(int eur, double course) {

        double USD;
        USD = eur * course;
        return USD;

    }
}
