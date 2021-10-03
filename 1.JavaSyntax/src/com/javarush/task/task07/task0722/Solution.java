package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String s;
        while (true){
         s = scanner.nextLine();

         if (s.equals("end"))
             break;
            list.add(s);
        }

for (String print:list)
    System.out.println(print);
        //напишите тут ваш код
    }
}