package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings= new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            String a = scanner.nextLine();
            strings.add(i,a);
        }
        int max = 0;
        for (int i = 0; i<strings.size(); i++){
            if (strings.get(i).length()>max){
                max = strings.get(i).length();
            }
        }
        for (int i = 0; i<strings.size(); i++){
            if (strings.get(i).length()==max){
                System.out.println(strings.get(i));
            }
        }
    }
}
