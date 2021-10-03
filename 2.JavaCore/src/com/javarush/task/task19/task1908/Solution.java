package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader( new InputStreamReader(System.in));
        //BufferedReader bufferedReader = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/input.txt"));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:/Hobbi/Java/JavaRush/output.txt",true));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(buff.readLine()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(buff.readLine(),true));
        buff.close();
        //  F:/Hobbi/Java/JavaRush/input.txt
        String text = null;
        int count = 0;
        while (bufferedReader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            String[] words = bufferedReader.readLine().trim().split(" ");
            for(int i = 0; i <words.length; i++){
                boolean isTrue = Pattern.matches("\\d+", words[i]);
                if(isTrue) {
                    bufferedWriter.write(words[i] + " ");
                }
            }
        }
        //закрываем потоки после использования
        bufferedReader.close();
        bufferedWriter.close();
    }
}
