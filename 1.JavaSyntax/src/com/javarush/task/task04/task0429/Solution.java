package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();//напишите тут ваш код
        int b = scanner.nextInt();//напишите тут ваш код
        int c = scanner.nextInt();//напишите тут ваш код
         int numPozit = 0;
         int numNegat = 0;
         if (a > 0)
             numPozit++;
         else if (a != 0)
             numNegat++;
         if (b > 0)
             numPozit++;
         else if (b != 0)
             numNegat++;
         if (c > 0)
             numPozit++;
         else if (c != 0)
             numNegat++;

        System.out.println("количество отрицательных чисел: " + numNegat);
        System.out.println("количество положительных чисел: " + numPozit);
    }
}
