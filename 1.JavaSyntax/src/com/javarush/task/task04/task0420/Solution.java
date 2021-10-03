package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //напишите тут ваш код
int[] array = {a,b,c};
boolean sorted = false;
int temp;
while (!sorted) {
    sorted = true;
    for (int i = 0; i<2; i++){
        if (array[i] < array[i+1]) {
            temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
            sorted = false;
        }
    }
}
        System.out.println(array[0] + " " + array[1]+ " "  + array[2] );
    }
}
