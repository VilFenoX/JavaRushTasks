package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      //  System.out.println("Введите число чисел");
        int i = Integer.parseInt(reader.readLine());
        if (i > 0)
        {
        int[] num = new int[i];
        int maximum = Integer.MIN_VALUE;
        for (int j = 0; j < num.length; j++) {
       //     System.out.println("ВВедите число");
            int k = Integer.parseInt(reader.readLine());
            num[j] = k;
            if (maximum<num[j])
            maximum = num[j];
        }
        System.out.println(maximum);
    }
}
}
