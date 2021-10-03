package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String pet = null;

        if (o instanceof Tiger){//напишите тут ваш код
            pet = "Тигр";} else
        if (o instanceof Lion){//напишите тут ваш код
            pet = "Лев";} else
                if (o instanceof Cat){//напишите тут ваш код
            pet = "Кот";} else
        if (o instanceof Bull){//напишите тут ваш код
            pet = "Бык";} else
        if (o instanceof Cow){//напишите тут ваш код
            pet = "Корова";} else//напишите тут ваш код
            pet = "Животное";
            return pet;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
