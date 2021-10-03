package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       int sum = 0;
        Scanner scanner = new Scanner(System.in);
       while (true){
String count = scanner.next();
           if (count.equals("сумма"))
               break;
int i = Integer.parseInt(count);
sum +=i;

       }
        System.out.println(sum);//напишите тут ваш код
    }
}

