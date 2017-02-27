package com.javarush.task.task06.task0614;

/*
Статические коты
*/

import java.util.ArrayList;

public class Cat {
    public static ArrayList cats = new ArrayList();



    public Cat() {
    }

    public static void main(String[] args) {
        Cat cat[] = new Cat[10];
        for(int i = 0; i < 10; i++)
            cat[i] = new Cat();
        for(int i = 0; i < 10; i++)
            Cat.cats.add(cat[i]);
        printCats();
    }

    public static void printCats() {
        for (int i =0; i < 10; i++)
            System.out.println(cats.get(i));
    }
}
