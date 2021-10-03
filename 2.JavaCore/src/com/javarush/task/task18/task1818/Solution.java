package com.javarush.task.task18.task1818;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        String file2 = scanner.nextLine();
        String file3 = scanner.nextLine();
        FileOutputStream fileOutputStream1 = new FileOutputStream(file1, true);
        FileInputStream fileInputStream1 = new FileInputStream(file2);
        FileInputStream fileInputStream2 = new FileInputStream(file3);
        while (fileInputStream1.available()>0){
           int data =  fileInputStream1.read();
           fileOutputStream1.write(data);
        }
        fileInputStream1.close();
        while (fileInputStream2.available()>0){
            int data = fileInputStream2.read();
            fileOutputStream1.write(data);
        }
        fileInputStream2.close();
        fileOutputStream1.close();
    }
}
