package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        //F:/Hobbi/Java/JavaRush/file.txt

        int countProbel = 0;
        int count = 0;
        float relation = 0;
        while (fileInputStream.available() > 0){// пока еще байты остались делаем то то
            int data = fileInputStream.read();
            if (data == 32) {
                countProbel++;
                count++;
            }else count++;
        }
        relation = (float) countProbel/count*100;
        fileInputStream.close();
        System.out.printf("%.2f", relation);
    }
}
