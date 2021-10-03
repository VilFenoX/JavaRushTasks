package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

       int a1 = max(a, b);
       int a2 = max(a1, c);
        int a3 = max(a2, d);
        System.out.println(a3);
    }

    static int max(int a1, int b1) {
        if (a1 <= b1)
            a1 = b1;
        return a1;



    }
}
