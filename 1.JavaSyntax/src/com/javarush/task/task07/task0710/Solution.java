package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++){
            String a = scanner.nextLine();
            list.add(0,a);
        }
        for (int i = 0; i<list.size(); i++)
            System.out.println(list.get(i));//напишите тут ваш код
    }
}
