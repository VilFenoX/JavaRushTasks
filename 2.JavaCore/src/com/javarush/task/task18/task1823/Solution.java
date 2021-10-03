package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        while (!(line=scanner.nextLine()).equals("exit")){
           new ReadThread(line);
        }
    }

    public static class ReadThread extends Thread  {
        String fileName;
        public ReadThread(String fileName) {
           this.fileName = fileName; //implement constructor body
        }
        BufferedReader bufferedReader;
        byte[] bytes = new byte[128];
        int maxCount = 0;
        @Override
        public void run() {
            try {
                bufferedReader = new BufferedReader(new FileReader(fileName));
                while (bufferedReader.ready()) {
                    bytes[bufferedReader.read()]++;
                }
                    for (int byteCount:bytes){
                        if (byteCount > maxCount){
                            maxCount = byteCount;
                        }
                    }
               for(int i = 0; i< bytes.length; i++){
                   if(bytes[i] == maxCount){
                       resultMap.put(fileName, i);
                   }
               }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        // implement file reading here - реализуйте чтение из файла тут
    }
}
