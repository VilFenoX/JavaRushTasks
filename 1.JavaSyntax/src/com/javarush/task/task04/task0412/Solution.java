package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 0;
        if (number < 0){
            a = number +1;
            System.out.println(a);
        } else
            if (number > 0) {
                a = number * 2;
                System.out.println(a);
            }
            else
            System.out.println(a);

    //напишите тут ваш код

    }

}