package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {

        log("In main method");
    }

    public static void log(String s) {
        String nameClass = Thread.currentThread().getStackTrace()[2].getClassName();
        String nameMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.println(nameClass + ": " + nameMethod + ": " + s);//напишите тут ваш код
    }
}
