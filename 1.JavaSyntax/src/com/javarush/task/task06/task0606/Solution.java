package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int num[] = new int[a.length()];
        for (int i =0; i< a.length(); i++){
         num[i] = a.charAt(i);
         if (num[i] % 2 == 0)
             even++;
         else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
