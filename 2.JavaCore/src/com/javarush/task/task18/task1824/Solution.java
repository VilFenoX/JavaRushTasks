package com.javarush.task.task18.task1824;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String fileName = scanner.nextLine();
            try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            // F:/Hobbi/Java/JavaRush/file.txt
                bufferedReader.close();

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
