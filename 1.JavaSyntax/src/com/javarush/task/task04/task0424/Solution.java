package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(); //напишите тут ваш код
        int n2 = scanner.nextInt(); //напишите тут ваш код
        int n3 = scanner.nextInt();

        if (n1==n2)
            System.out.println(3);
        else if (n1==n3)
            System.out.println(2);
        else if (n2==n3)
            System.out.println(1);//напишите тут ваш код

    }
}
