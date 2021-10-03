package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код

    public static void main(String[] args) {
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(2));//напишите тут ваш код

    }
    public static int convertToSeconds(int hour){
        return hour*60*60;
    }
}
