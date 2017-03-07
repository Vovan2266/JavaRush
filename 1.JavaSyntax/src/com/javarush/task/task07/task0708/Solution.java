package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        ArrayList list = new ArrayList();
        for(int i = 0; i < 5; i++){
            String s = reader.readLine();
            list.add(s);

        }
        for(int j = 0; j < list.size(); j++){

            System.out.println( list.get(j) );


           
       }



    }
}
