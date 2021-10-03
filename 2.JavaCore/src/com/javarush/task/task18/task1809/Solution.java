package com.javarush.task.task18.task1809;

import java.io.*;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String string1 = reader.readLine();
      String string2 = reader.readLine();

       reader.close();

       // FileInputStream fileInputStream = new FileInputStream(new File("F:/Hobbi/Java/JavaRush/input.txt"));
       // FileOutputStream fileOutputStream2 = new FileOutputStream(new File("F:/Hobbi/Java/JavaRush/output1.txt"));

        FileInputStream fileInputStream = new FileInputStream(string1);
        FileOutputStream fileOutputStream2 = new FileOutputStream(string2);
        byte[] buff = new byte[fileInputStream.available()];
        byte[] rezult = new byte[fileInputStream.available()];
        while (fileInputStream.available()>0){
            fileInputStream.read(buff);
        }
        int j = 0;
        for (int i = buff.length-1; i>=0;i--){
            rezult[j] = buff[i];
            j++;
        }
        fileOutputStream2.write(rezult);
        fileInputStream.close();
        fileOutputStream2.close();
    }
}
