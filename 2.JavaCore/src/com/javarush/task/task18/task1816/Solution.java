package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        //F:/Hobbi/Java/JavaRush/file.txt

        int count = 0;
        while (fileInputStream.available() > 0){// пока еще байты остались делаем то то
            int data = fileInputStream.read();
            if (((65<=data)&&(data<=90))||((97<=data)&&(data<=122))) {
                count++;
            }
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
