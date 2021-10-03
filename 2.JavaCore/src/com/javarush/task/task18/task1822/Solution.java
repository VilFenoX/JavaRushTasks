package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {


           Scanner scanner = new Scanner(System.in);
           String fileName = scanner.nextLine();
            // F:/Hobbi/Java/JavaRush/input.txt
           BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
           // BufferedReader bufferedReader = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/input.txt"));

            while (bufferedReader.ready()){
             String data = bufferedReader.readLine();
               if(data.startsWith(args[0] + " ")){
                   System.out.println(data);
                   break;
               }

            }
            bufferedReader.close();
        }

}
