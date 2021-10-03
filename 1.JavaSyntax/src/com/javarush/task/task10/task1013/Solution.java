package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
       private String name;
       private int age;
       private boolean sex;
       private  Human mother;
       private  Human father;
       private  Human child;
       // Напишите тут ваши переменные и конструкторы

        public Human(String name, int age, boolean sex, Human mother, Human father) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, Human mother, Human father, Human child) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            this.child = child;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }
        public Human() {

        }

        public Human(boolean sex, Human mother, Human father) {
            this.sex = sex;
            this.mother = mother;
            this.father = father;
        }

        public Human(Human mother, Human father, Human child) {
            this.mother = mother;
            this.father = father;
            this.child = child;
        }

        public Human(boolean sex, Human mother) {
            this.sex = sex;
            this.mother = mother;
        }

        public Human(Human father) {
            this.father = father;
        }
    }
}
