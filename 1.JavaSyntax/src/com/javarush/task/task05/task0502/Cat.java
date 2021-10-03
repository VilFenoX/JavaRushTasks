package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int resultCat1 = 0;
        int resultCat2 = 0;
        if (anotherCat.age < this.age)
            resultCat1++;
        else if (anotherCat.age != this.age)
            resultCat2++;//напишите тут ваш код
        if (anotherCat.weight < this.weight)
            resultCat1++;
        else if (anotherCat.weight != this.weight)
            resultCat2++;//напишите тут ваш код
        if (anotherCat.strength < this.strength)
            resultCat1++;
        else if (anotherCat.strength != this.strength)
            resultCat2++;
        if (resultCat1 == resultCat2)
            return false;
        if (resultCat1 < resultCat2)
            return false;
        else return true;
    }

    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//        cat1.age = 4;
//        cat2.age = 4;
//        cat1.weight = 3;
//        cat2.weight = 3;
//        cat1.strength = 3;
//        cat2.strength = 3;
//
//        System.out.println(cat1.fight(cat2));
//        System.out.println(cat2.fight(cat1));
    }
}
