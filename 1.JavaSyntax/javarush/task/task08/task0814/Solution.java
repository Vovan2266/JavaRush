package com.javarush.task.task08.task0814;

import java.util.HashSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < 20; i++){
            set.add(5 + i);
        }
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        HashSet rSet = new HashSet<>();
        for (Integer i : set) {
            if (i <= 10) rSet.add(i);
        }
        return rSet;
    }

    public static void main(String[] args) {

    }
}
