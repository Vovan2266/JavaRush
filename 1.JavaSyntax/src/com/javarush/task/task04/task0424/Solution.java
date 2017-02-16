package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int n;
        if(a == b && b == c){
            return;
        }
        else if(a == b && b!= c){
            n = 3;
        }
        else if(a != b && b == c ){
            n = 1;
        }
        else if(a != b && a == c) {
            n = 2;
        } else {
            return;
        }

        System.out.println(n);

    }
}
