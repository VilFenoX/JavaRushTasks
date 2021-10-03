package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int i = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, i);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int i) {
        int mini = minin(a,b);
        mini = minin(mini,c);
        mini = minin(mini,d);
        mini = minin(mini, i);

        return mini;
    }

    private static int minin(int a, int b) {
    return a<=b ? a : b;
    }
}
