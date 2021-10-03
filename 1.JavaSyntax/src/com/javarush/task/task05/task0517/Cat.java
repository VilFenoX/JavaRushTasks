package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
  String address = null;
     String color = null;

    public Cat(String name){
        this.name = name;
        this.age = 5;
        this.weight = 4;
        this.color ="color";
    }//напишите тут ваш код
    public Cat(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "color";
    }//напишите тут ваш код
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "color";
    }//напишите тут ваш код
    public Cat(int weight, String color){
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }//напишите тут ваш код
    public Cat(int weight, String color, String address){

        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }//напишите тут ваш код

    public static void main(String[] args) {

    }
}
