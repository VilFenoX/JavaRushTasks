package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a%2;
        if (a>0 && a <10 && b == 0)
            System.out.println("четное однозначное число");
        else if (a>0 && a <10 && b != 0)
            System.out.println("нечетное однозначное число");
        else if (a>=10 && a <100 && b == 0)
            System.out.println("четное двузначное число");//напишите тут ваш код
        else if (a>=10 && a <100 && b != 0)
            System.out.println("нечетное двузначное число");//напишите тут ваш код
        else if (a>=100 && a <1000 && b == 0)
            System.out.println("четное трехзначное число");//напишите тут ваш код
        else if (a>=100 && a <1000 && b != 0)
            System.out.println("нечетное трехзначное число");//напишите тут ваш код

    }
}
