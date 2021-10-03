package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();//напишите тут ваш код
       int b = scanner.nextInt();//напишите тут ваш код
       int c = scanner.nextInt();//напишите тут ваш код
        if (a > 0 && b > 0 && c > 0)
            System.out.println("3");
        else if  (a > 0 && b > 0 || a>0 && c > 0 || b>0 && c>0)
            System.out.println("2");
        else if (a > 0 || b > 0 || c > 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
