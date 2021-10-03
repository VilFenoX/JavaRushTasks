package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader( new InputStreamReader(System.in));
        //BufferedReader bufferedReader = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/input.txt"));
       BufferedReader bufferedReader = new BufferedReader(new FileReader(buff.readLine()));
        buff.close();
        //  F:/Hobbi/Java/JavaRush/input.txt
        String text = null;
        int count = 0;
        while (bufferedReader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            text = bufferedReader.readLine().replaceAll("[\\W]", " ").replaceAll("_", "");
            String[] words = text.trim().split(" ");
            for(int i = 0; i <words.length; i++){
                if(words[i].equals("world"))
                    count++;

        }
        }
        System.out.println(count);
        //закрываем потоки после использования
        bufferedReader.close();
    }
}
