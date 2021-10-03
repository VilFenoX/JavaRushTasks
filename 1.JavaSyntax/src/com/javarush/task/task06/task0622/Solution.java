package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
int a = reader.nextInt();
int b = reader.nextInt();
int c = reader.nextInt();
int d = reader.nextInt();
int e = reader.nextInt();

       int[] num = {a,b,c,d,e};
       boolean sorted = false;
        int temp;

       while(!sorted){
           sorted = true;

           for ( int i = 0; i<num.length-1; i++){
               if (num[i] > num[i + 1]) {

                   temp = num[i];
                   num[i] = num[i + 1];
                   num[i + 1] = temp;
                   sorted = false;
               }
           }
               
           }
       for(int i = 0; i<num.length; i++)
       System.out.println(num[i]); // Вывод построчно

    }

    }

