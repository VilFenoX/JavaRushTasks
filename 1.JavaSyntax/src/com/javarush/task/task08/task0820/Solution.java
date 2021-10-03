package com.javarush.task.task08.task0820;

import java.util.*;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        //System.out.println();
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        result.add(new Cat());//напишите тут ваш код
        result.add(new Cat());//напишите тут ваш код
        result.add(new Cat());//напишите тут ваш код
        result.add(new Cat());//напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
       Set<Dog> result = new HashSet<>();
       result.add(new Dog());//напишите тут ваш код
       result.add(new Dog());//напишите тут ваш код
       result.add(new Dog());//напишите тут ваш код
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
       //напишите тут ваш код
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
        //напишите тут ваш код
        //pets.removeIf(pet -> pet instanceof Cat);
    }

    public static void printPets(Set<Object> pets) {
       for (Object pet : pets){
           System.out.println(pet);
       } //напишите тут ваш код
    }

    public static class Cat{
        Cat(){

        }
    }//напишите тут ваш код

    public static class Dog{
        Dog(){

        }
    }//напишите тут ваш код
}
