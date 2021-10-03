package com.javarush.task.task04.task0436;

/*
Рисуем прямоугольник
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // число строк
        int n = scanner.nextInt(); // число столбцов
        for (int i = 0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }//напишите тут ваш код



    }
}
