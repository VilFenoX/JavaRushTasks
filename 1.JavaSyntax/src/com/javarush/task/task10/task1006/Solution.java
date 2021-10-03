package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        //System.out.println(d);
        char c = (short) 'd';
        //System.out.println(c);
        short s = (short) 2.22;
        //System.out.println(s);
        int i = (int) 150000;
       // System.out.println(i);
        float f = (float) 0.50f;
       // System.out.println(f);
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("result: " + result);
    }
}