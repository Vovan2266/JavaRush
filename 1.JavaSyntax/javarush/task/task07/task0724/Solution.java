package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human anya = new Human("Аня",false,55);
        Human katy = new Human("Катя",false,40);
        Human igor = new Human("Игор",true,50);
        Human stas = new Human("Стас",true,43);
        Human vera = new Human("Вера",false,20,igor,anya);
        Human ira = new Human("Ира",false,15,stas,katy);
        Human vlad = new Human("Влад", true,17,igor,katy);
        Human petya = new Human("Петя",true,19,stas,anya);
        Human yura = new Human("Юра",true,25,igor,anya);

        anya.toString();
        katy.toString();
        igor.toString();
        stas.toString();
        vera.toString();
        ira.toString();
        vlad.toString();
        petya.toString();
        yura.toString();

        System.out.println(anya);
        System.out.println(katy);
        System.out.println(igor);
        System.out.println(stas);
        System.out.println(vera);
        System.out.println(ira);
        System.out.println(vlad);
        System.out.println(petya);
        System.out.println(yura);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















