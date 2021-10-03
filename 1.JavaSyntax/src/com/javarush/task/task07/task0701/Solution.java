package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] array = new  int[20];// создай и заполни массив
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int max(int[] array) {
        int temp;
        for (int i = array.length-1; i>0; i--){
            for (int j = 0; j<i; j++){
                if (array[j]>array[j+1]){
                   temp = array[j];
                   array[j]=array[j+1];
                   array[j+1] = temp;
                }
            }
        }// найди максимальное значение
        return array[array.length-1];
    }
}
