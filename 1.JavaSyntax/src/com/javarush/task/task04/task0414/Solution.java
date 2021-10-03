package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int Vyear = 366;
        int noVyear = 365;
        if (year % 400 ==0)
        System.out.println("количество дней в году: " + Vyear);
        else {
            int a = year % 400;
            if (a % 100 ==0)
                System.out.println("количество дней в году: " + noVyear);
            else
            {
                int b = a % 100;
                if (b % 4 ==0)
                    System.out.println("количество дней в году: " + Vyear);
                else System.out.println("количество дней в году: " + noVyear);
            }               //напишите тут ваш код
        }
    }
}