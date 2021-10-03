package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("file");
        words.add("vid");
        words.add("B");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(bufferedReader.readLine()));
        //BufferedReader bufferedReaderFile = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/input.txt"));
        String text = "";
        while (bufferedReaderFile.ready()){
           text=bufferedReaderFile.readLine();
            String[] wordsFile =  text.trim().split(" ");
            int count = 0;
            int needCount = 2;
           for (String word: words) {
                for (String wordFile: wordsFile) {
                   if (word.equals(wordFile)) {
                       count++;
                   }
                }

                }
           if (count==needCount){
                   System.out.println(text);
            }
        }

        bufferedReader.close();
        bufferedReaderFile.close();
    }
}
