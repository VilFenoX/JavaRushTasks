package com.javarush.task.task07.task0724;
public class Solution {
    public static void main(String[] args) {
        Human GranMatherF = new Human("Катя",false, 78 );// напишите тут ваш код
        Human GranFatherF = new Human("даня",true, 78 );// напишите тут ваш код
        Human GranMatherM = new Human("Света",false, 78 );// напишите тут ваш код
        Human GranFatherM = new Human("Костя",true, 78 );
        Human Mather = new Human("Лида",false, 38, GranFatherM, GranMatherM );// напишите тут ваш код
        Human Father = new Human("Саша",true, 38, GranFatherF, GranMatherF);// напишите тут ваш код
        Human Dother = new Human("Вика",false, 7, Father,Mather );// напишите тут ваш код
        Human Son1 = new Human("Паша",true, 7, Father,Mather);
        Human Son2= new Human("Дима",true, 7, Father,Mather);
    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            System.out.println(toString());
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            System.out.println(toString());
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}