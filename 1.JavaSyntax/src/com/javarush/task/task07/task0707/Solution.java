package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list=new ArrayList<String>();

        list.add("Obama");
        list.add("wants to");
        list.add("be a president");
        list.add("of the");
        list.add("USA");

        int a = list.size();

        System.out.println(a);

        for (int i = 0; i < a; i++) {

            System.out.println(list.get(i));
        }
    }
}

