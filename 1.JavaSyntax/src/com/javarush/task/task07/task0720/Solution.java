package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numN = scanner.nextInt();
        int numM = scanner.nextInt();
            for (int i =0; i<numN; i++){
                list.add(scanner.next());
             }
            for (int i = 0; i<numM;i++ ){
               list.add(list.size(), list.get(0));
               list.remove(0);

            }

            for (String print : list)
                 System.out.println(print);//напишите тут ваш код
    }
}
