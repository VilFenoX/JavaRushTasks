package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        for (Cat cat : cats){
          cats.remove(cat);
           break;
        } // step 4

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<>();
        cat.add(new Cat());//напишите тут ваш код. step 2 - пункт 2
        cat.add(new Cat());//напишите тут ваш код. step 2 - пункт 2
        cat.add(new Cat());//напишите тут ваш код. step 2 - пункт 2
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
       for (Cat cat : cats){
           System.out.println(cat);
       } // step 4 - пункт 4
    }

   public static class Cat{
       Cat() {

       }
   } // step 1 - пункт 1
}
