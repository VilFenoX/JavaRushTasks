package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {

        Human childrenOne = new Human("ChilOne", true, 5, new ArrayList<>());
        Human childrenTwo = new Human("ChilTwo", false, 6,  new ArrayList<>());
        Human childrenTree = new Human("ChilTree", true, 10,  new ArrayList<>());
        Human father = new Human("Father", true, 33,  new ArrayList<>(Arrays.asList(childrenOne,childrenTwo,childrenTree)));
        Human mother = new Human("Mother", false, 35,  new ArrayList<>(Arrays.asList(childrenOne,childrenTwo,childrenTree)));
        Human grandFatherOne = new Human("grandFatherOne", true, 56,  new ArrayList<>(Arrays.asList(father)));
        Human grandFatherTwo = new Human("grandFatherTwo", true, 65, new ArrayList<>(Arrays.asList(mother)));
        Human grandMotherOne = new Human("grandMotherOne", false, 76,  new ArrayList<>(Arrays.asList(father)));
        Human grandMotherTWo = new Human("grandMotherTwo", false, 71, new ArrayList<>(Arrays.asList(mother)));
     //напишите тут ваш код
    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;//напишите тут ваш код

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            System.out.println(toString());
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
