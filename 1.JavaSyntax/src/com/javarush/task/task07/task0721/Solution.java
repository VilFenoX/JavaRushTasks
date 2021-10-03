package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] list = new int[20];
for (int i = 0; i<20; i++){
    list[i] = scanner.nextInt();
}
for (int i = list.length-1; i>0; i--){
for (int j = 0; j<i; j++){
    if (list[j] > list[j + 1]){
        int tmp = list[j];
        list[j] = list[j+1];
        list[j + 1] = tmp;
    }
}
        }
        int maximum = list[19];
        int minimum = list[0];

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}
