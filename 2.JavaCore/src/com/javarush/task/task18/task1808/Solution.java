package com.javarush.task.task18.task1808;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        FileInputStream fileInputStream1 = new FileInputStream(scanner.nextLine());
        FileOutputStream fileOutputStream2 = new FileOutputStream(scanner.nextLine());
        FileOutputStream fileOutputStream3 = new FileOutputStream(scanner.nextLine());

        int midPoint = fileInputStream1.available() / 2;
        while (fileInputStream1.available() > 0) {
            if (fileInputStream1.available() > midPoint)
                fileOutputStream2.write(fileInputStream1.read());
            else
                fileOutputStream3.write(fileInputStream1.read());
        }

        fileInputStream1.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
    }
    }

