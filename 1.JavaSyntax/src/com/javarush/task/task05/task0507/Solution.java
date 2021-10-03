package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true){
            int a = scanner.nextInt();
            sum = sum +a;
            count++;
            if (a == -1)
                break;
        }
        sum++;
        count--;
        System.out.println(sum/count);//напишите тут ваш код  //напишите тут ваш код
    }
}

