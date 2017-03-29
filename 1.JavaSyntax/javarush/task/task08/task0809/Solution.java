package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        Date date = new Date();
        long before = date.getTime();
        insert10000(list);
        Date date2 = new Date();
        long after = date2.getTime();
        return after - before;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
