package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] arrayMinOne = new int[10];
        int[] arrayMinTwo = new int[10];
        arrayMinOne = Arrays.copyOfRange(array, 0, 10);//напишите тут ваш код
        arrayMinTwo = Arrays.copyOfRange(array, 10, 20);

        for (int i = 0; i < arrayMinTwo.length; i++) {
            System.out.println(arrayMinTwo[i]);
            //напишите тут ваш код
        }
    }
}
