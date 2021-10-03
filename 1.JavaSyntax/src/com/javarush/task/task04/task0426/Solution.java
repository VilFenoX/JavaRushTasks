package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a%2;
        if (a<0 && b==0)
            System.out.println("отрицательное четное число");
        else if (a<0 && b != 0 )
            System.out.println("отрицательное нечетное число");
        else if (a>0 && b==0)
            System.out.println("положительное четное число");
        else if (a>0 && b != 0 )
            System.out.println("положительное нечетное число");
        else
            System.out.println("ноль");//напишите тут ваш код

    }
}
