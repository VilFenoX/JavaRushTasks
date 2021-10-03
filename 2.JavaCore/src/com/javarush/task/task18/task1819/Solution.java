package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Scanner;/*
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileOnePuth = scanner.nextLine();
       String fileTwoPuth = scanner.nextLine();
       // String fileOnePuth = "F:/Hobbi/Java/JavaRush/input.txt";
      // String fileTwoPuth = "F:/Hobbi/Java/JavaRush/output.txt";
        File fileOne = new File(fileOnePuth);
        File fileTwo = new File(fileTwoPuth);
        FileInputStream fileInputStream = new FileInputStream(fileOne);
        FileInputStream fileInputStream2 = new FileInputStream(fileTwo);
        byte[] buffFileOne = new byte[fileInputStream.available()];
        byte[] buffFileTwo = new byte[fileInputStream2.available()];
        while (fileInputStream.available()>0){
            fileInputStream.read(buffFileOne);
        }
        while (fileInputStream2.available()>0){
            fileInputStream2.read(buffFileTwo);
        }
       byte[] bigbuff = new byte[buffFileOne.length + buffFileTwo.length];
        System.arraycopy(buffFileTwo, 0, bigbuff,0,buffFileTwo.length);
       System.arraycopy(buffFileOne, 0, bigbuff,buffFileTwo.length,buffFileOne.length);
        FileOutputStream fileOutputStream = new FileOutputStream(fileOne);
        fileOutputStream.write(bigbuff);
        fileInputStream.close();
        fileInputStream2.close();
        fileOutputStream.close();
    }
}
