package com.javarush.task.task05.task0502;

/**
 * Created by duotek on 15.02.2017.
 */
public class Cat {

    public String name = "Vaska";
    public int age = 5;
    public int weight = 10;
    public int strength = 6;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        int index = age + weight + strength;
        int index1 = anotherCat.age + anotherCat.weight + anotherCat.strength;
        if (index > index1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
    }

}

