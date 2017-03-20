package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable{
        System.out.println("Cat is destroyed");
    }

}

class Dog {
    protected void finalize() throws Throwable{
        System.out.println("Dog is destroyed");
    }
}
