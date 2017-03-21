package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int max = 0;
        int min = 999999;
        int maxindex = 0;
        int minindex = 0;
        for(int i = 0; i < 10; i++){
            list.add(reader.readLine());
            if(list.get(i).length() > max){
                max = list.get(i).length();
                maxindex = i;
            }
            if(list.get(i).length() < min){
                min = list.get(i).length();
                minindex = i;
            }

        }
        if(maxindex < minindex) {
            System.out.println(list.get(maxindex));
        }
        else System.out.println(list.get(minindex));

            }
        }
