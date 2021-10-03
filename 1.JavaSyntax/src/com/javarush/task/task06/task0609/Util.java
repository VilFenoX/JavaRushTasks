package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        int deltaX = x2-x1;
        int deltaY = y2 - y1;
        int a = (deltaX*deltaX) + (deltaY*deltaY);
        return Math.sqrt(a);//напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}
