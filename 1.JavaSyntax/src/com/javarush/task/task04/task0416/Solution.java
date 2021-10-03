package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       double time = scanner.nextDouble();
       double green = 3;
       double yellow = 4;
       double red = 5;

       time = time % 5;
       if (time < green)
           System.out.println("зеленый");//напишите тут ваш код
       else if (time < yellow)
           System.out.println("желтый");//напишите тут ваш код
       else
           System.out.println("красный");//напишите тут ваш код

    }
}