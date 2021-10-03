package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arrayStr = new String[10];//напишите тут ваш код
        int[] arrayInt = new int[10];//напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = scanner.nextLine();
        }
            for (int i = 0; i < arrayInt.length; i++) {
                arrayInt[i] = arrayStr[i].length();
                System.out.println(arrayInt[i]);
            }

        }
    }

