package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("vasa", 33,"samara");
        Man man2 = new Man("vasa2", 23,"samara2");
       Woman woman1 = new Woman("Vika", 44, "Moscow");
       Woman woman2 = new Woman("Vika2", 22, "Moscow1");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);//напишите тут ваш код
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);//напишите тут ваш код
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);//напишите тут ваш код
    }
public static class Man{
    String name;
    int age;
    String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this. address = address;
    }
}public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this. address = address;

    }
}
    //напишите тут ваш код
}
