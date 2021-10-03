package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePuth;
        byte[] buffFile;
        TreeMap<Integer, byte[]> treeMap = new TreeMap<>();
        String[] numbersFile = null;
      while (!(filePuth = scanner.nextLine()).equals("end")){
          numbersFile  = filePuth.trim().split(".part");
          int key = Integer.parseInt(numbersFile[1]);
          BufferedInputStream bufferedInputStream = new BufferedInputStream( new FileInputStream(filePuth));
          buffFile = new byte[bufferedInputStream.available()];
          bufferedInputStream.read(buffFile);
          treeMap.put(key, buffFile);
          bufferedInputStream.close();
      }
        // String filePuth = "F:/Hobbi/Java/JavaRush/file.txt.part1";
        // String fileTwoPuth = "F:/Hobbi/Java/JavaRush/output.txt";
        String outputFile = numbersFile[0];
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream( new FileOutputStream(outputFile,true));
        for(Map.Entry<Integer, byte[]> entry : treeMap.entrySet()) {
            bufferedOutputStream.write(entry.getValue());
        }
        bufferedOutputStream.close();
    }
}
