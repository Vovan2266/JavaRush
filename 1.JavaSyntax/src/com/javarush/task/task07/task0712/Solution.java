package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int max = 0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() == max) {
                System.out.println(list.get(i));
            }
        }
            int min = list.get(0).length();

            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i);
                int count = s.length();
                if (count < min) {
                    min = count;
                }
                if(max > min) System.out.println(min);
                if (max == min) System.out.println(max + min);

            }

        }
    }
