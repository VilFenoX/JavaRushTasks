package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt(); //напишите тут ваш код
        if((a==b)&&(b==c)){
            System.out.println(a + " "+ b + " " + c+" " );
        } else if((a==b)&&(a!=c)){
            System.out.println(a+ " " +b);
        } else if((a==c)&&(a!=b)){
            System.out.println(a+ " " +c);
        }else if((b==c)&&(b!=a))
            System.out.println(b+ " " +c);

    }
}

