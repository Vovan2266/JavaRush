package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {

    public String name = "Lord";
    public int age = 5;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;

    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

    }
}
