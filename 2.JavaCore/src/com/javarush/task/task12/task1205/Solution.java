package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String rez = null;
        if (o instanceof Cow)//Напишите тут ваше решение
            rez = "Корова";
        else if (o instanceof Dog)//Напишите тут ваше решение
            rez = "Собака";
        else if (o instanceof Whale)//Напишите тут ваше решение
            rez = "Кит";
        else if (o instanceof Pig)//Напишите тут ваше решение
            rez = "Неизвестное животное";

        return rez;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
