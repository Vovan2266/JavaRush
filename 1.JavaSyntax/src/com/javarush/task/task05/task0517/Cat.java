package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name = null;
    private int age = 4;
    private int weight = 5;
    private String color = "White";
    private String address = null;

    public Cat(String name){

        this.name = name;
        this.age = 4;
        this.weight = 8;
        this.color = "White";
        this.address = null;

    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "White";
        this.address = null;

    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "White";
        this.address = null;

    }

    public Cat(int weight, String color) {
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = null;

    }
    public Cat(int weight, String color, String address) {
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;


    }

    public static void main(String[] args) {

    }
}
