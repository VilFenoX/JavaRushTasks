package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;/*
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//Принимаем имя файла с консоли
        String string = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<Integer>();

        FileInputStream fileInputStream = new FileInputStream(string);
        //FileInputStream fileInputStream = new FileInputStream(new File("F:/Hobbi/Java/JavaRush/output.txt"));

        int count = 0;
        while (fileInputStream.available() > 0){// пока еще байты остались делаем то то
          int data = fileInputStream.read();
           if (data == 44) {
               count++;
           }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
