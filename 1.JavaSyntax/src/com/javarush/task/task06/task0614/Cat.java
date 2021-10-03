package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {


        Cat cat1 = new Cat();//напишите тут ваш код
        Cat cat2 = new Cat();//напишите тут ваш код
        Cat cat3 = new Cat();//напишите тут ваш код
        Cat cat4 = new Cat();//напишите тут ваш код
        Cat cat5 = new Cat();//напишите тут ваш код
        Cat cat6 = new Cat();//напишите тут ваш код
        Cat cat7 = new Cat();//напишите тут ваш код
        Cat cat8 = new Cat();//напишите тут ваш код
        Cat cat9 = new Cat();//напишите тут ваш код
        Cat cat10 = new Cat();//напишите тут ваш код
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);
        cats.add(cat8);
        cats.add(cat9);
        cats.add(cat10);
        printCats();
    }

    public static void printCats() {
        for(int i=0; i< cats.size(); i++)
        System.out.println(cats.get(i)); //напишите тут ваш код
    }
}
