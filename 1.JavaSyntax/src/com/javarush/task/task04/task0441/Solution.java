package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    private static int max;
    private static int min;
    private static int middle;

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();//напишите тут ваш код
       int b = scanner.nextInt();//напишите тут ваш код
       int c = scanner.nextInt();
       max = max(a,b);
       max = max(max,c);
       min = min(a,b);
       min = min(min,c);
       //напишите тут ваш код
        if (a==b && b==c){
            System.out.println(a);
        }
         else if (a==b || a==c ){
            System.out.println(a);
        } else if (b==a || b==c){
            System.out.println(b);
        } else if (c==a || c==b){
            System.out.println(c);
        }
          else if (a==max || a==min){
            middle = middle(b,c);
            System.out.println(middle); }
           else if (b==max || b==min){
                middle = middle(a,c);
            System.out.println(middle);}
        else if (c==max || c==min){
            middle = middle(a,b);
            System.out.println(middle);}
            }
    private static int middle(int b, int c) {
    if (b==max || b==min)
        return c;
    else return b;
    }
        private static int min(int a, int b) {
        if (a<b)
            return a;
        else
            return b;
    }
    private static int max(int a, int b) {
    if (a>b)
    return a;
    else
        return b;
    }
 }
