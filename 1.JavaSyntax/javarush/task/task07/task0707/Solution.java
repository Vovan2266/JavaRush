package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        String s = reader.readLine();
        list.add(s);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));

        }
    }
}
