package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/


public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        int a = x1 - x2;
        int b = y1 - y2;
        double c = (a*a)+(b*b);
        double t = 0;
        t = Math.sqrt(c);
        return t;
    }


    public static void main(String[] args) {

    }
}
