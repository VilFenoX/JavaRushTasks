package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args){

try{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader

    String path;
    path= bufferedReader.readLine();

    File file = new File(path);// F:/Hobbi/Java/JavaRush/file.txt
   // File file = new File("F:/Hobbi/Java/JavaRush/file.txt");// F:/Hobbi/Java/JavaRush/file.txt
        FileWriter fileWriter = new FileWriter(file); // поток, который подключается к текстовому файлу
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter

    //bufferedWriter.write(path + "\r\n");
        String line;
        while(!(line = bufferedReader.readLine()).equals("exit")) {

            bufferedWriter.write(line + "\r\n");

        }

        bufferedWriter.write("exit");

        bufferedReader.close(); // закрываем поток
        bufferedWriter.close(); // закрываем поток
    } catch (Exception e) {
        e.printStackTrace();
    }// напишите тут ваш код
    }
}
