package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s;
        for (int i = 0; i<4; i++)
            result = result + s;//напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count) {
        String result = s;
        for (int i = 1; i<count; i++)
            result = result + s;//напишите тут ваш код
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringHelper.multiply("Амиго"));
        System.out.println(StringHelper.multiply("Дельта", 7));
    }
}
