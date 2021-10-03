package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] array = new int[15];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i<6; i++) {
            sum1 = sum1 + array[(2*i)+1];

        }
        for (int i = 0; i<7; i++) {
            sum2 = sum2 + array[2*i];
        }
        if (sum1>sum2)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");//напишите тут ваш код
    }
}
