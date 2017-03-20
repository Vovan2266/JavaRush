package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        int min = a - b;
        return min;
    }

    public static int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static double division(int a, int b) {
        double div = a / b;
        return div;
    }

    public static double percent(int a, int b) {
        double per = (a * b) / 100;
        return per;
    }

    public static void main(String[] args) {

    }
}