package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
      for (int i = 0; i<5; i++) {
          list.add(scanner.nextLine());
      }
      list.remove(2);
      for (int i = list.size()-1; i>=0;i--)
          System.out.println(list.get(i));//напишите тут ваш код
    }
}
