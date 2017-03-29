package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());
        Integer c = Integer.parseInt(reader.readLine());

        if (a >= c && b < c) {
            System.out.println(c);
        }
        else if (a <= c && b > c) {
            System.out.println(c);
        }
        else if (a <= b && c < a) {
            System.out.println(a);
        }
        else if (a >= b && b > c) {
            System.out.println(b);
        }
        else if (a <= b && b < c) {
            System.out.println(b);
        }
        else if (a >= b && a < c) {
            System.out.println(a);
        }
        else if (b >= c && a < c) {
            System.out.println(c);
        }
        else if(b >= c && a > b) {
                System.out.println(b);
        }
        else if (a.equals(b) && b.equals(c)) {
            System.out.println(a | b | c);
        }
    }
}
