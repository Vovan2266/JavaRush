package com.javarush.task.task07.task0711;

/*
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
            for (int i = 0; i < 13; i += 1)
            {
                list.add(0, list.get(4));
                list.remove(5);
            }
            for (int i = 0; i < 5; i += 1)
            {
                System.out.println(list.get(i));
            }
    }
}
