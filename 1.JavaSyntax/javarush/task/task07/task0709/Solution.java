package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/*
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int max = 0;
        for(int i = 0; i < 5; i++){
            String s = reader.readLine();
            list.add(s);
            if(list.get(i).length() > max)
                max = i;
        }
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).length() == max){
                System.out.println(list.get(i));
            }
        }
    }
}
