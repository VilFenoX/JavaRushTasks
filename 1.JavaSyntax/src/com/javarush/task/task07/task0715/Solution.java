package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<String>();
       list.add("мама");//напишите тут ваш код
       list.add("мыла");//напишите тут ваш код
       list.add("раму");

       list.add(1, "именно");//напишите тут ваш код
       list.add(3, "именно");//напишите тут ваш код
       list.add(5, "именно");

       for (String print : list)
           System.out.println(print);//напишите тут ваш код
    }
}
