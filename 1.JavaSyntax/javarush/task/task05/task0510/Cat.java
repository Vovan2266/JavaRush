package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    private String name = null;
    private int age = 6;
    private int weight = 8;
    private String color = "multicolor";
    private String address = null;

    public void initialize(String name){

        this.name = name;
        this.age = 6;
        this.weight = 8;
        this.color = "multicolor";
        this.address = null;

    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = null;

    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = null;
        this.address = null;

    }

    public void initialize(int weight, String color) {

        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;


    }

    public static void main(String[] args) {
    }
    }