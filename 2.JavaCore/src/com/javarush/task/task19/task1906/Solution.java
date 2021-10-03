package com.javarush.task.task19.task1906;

/*
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader( new InputStreamReader(System.in));
       // BufferedReader bufferedReader = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/input.txt"));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:/Hobbi/Java/JavaRush/output.txt"));

        BufferedReader bufferedReader = new BufferedReader(new FileReader(buff.readLine()));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(buff.readLine()));
buff.close();
      //  F:/Hobbi/Java/JavaRush/input.txt
        while (bufferedReader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = bufferedReader.read(); //читаем один символ (char будет расширен до int)
            bufferedWriter.write(bufferedReader.read()); //пишем один символ (int будет обрезан/сужен до char)
        }

        //закрываем потоки после использования
        bufferedReader.close();
       bufferedWriter.close();
    }
}
