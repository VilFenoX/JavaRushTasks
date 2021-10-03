package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String pet = null;
        if (o instanceof Cat){
            pet = "Кот";}else
        if (o instanceof Tiger){
            pet = "Тигр";}else
        if (o instanceof Lion){
            pet = "Лев";}else
        if (o instanceof Bull){
            pet = "Бык";}else

            pet = "Животное";//напишите тут ваш код

        return pet;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
