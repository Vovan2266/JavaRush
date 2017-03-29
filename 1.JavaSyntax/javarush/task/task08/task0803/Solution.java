package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция HashMap из котов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        HashMap map = new HashMap<>();
        map.put(cats[0], new Cat(cats[0]));
        map.put(cats[1], new Cat(cats[1]));
        map.put(cats[2], new Cat(cats[2]));
        map.put(cats[3], new Cat(cats[3]));
        map.put(cats[4], new Cat(cats[4]));
        map.put(cats[5], new Cat(cats[5]));
        map.put(cats[6], new Cat(cats[6]));
        map.put(cats[7], new Cat(cats[7]));
        map.put(cats[8], new Cat(cats[8]));
        map.put(cats[9], new Cat(cats[9]));
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
