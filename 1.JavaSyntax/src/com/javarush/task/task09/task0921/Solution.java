package com.javarush.task.task09.task0921;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
       while (true) {
           try {
               data.add(scanner.nextInt());
           } catch (Exception e) {
              break;
           }

       }
        for (int dat: data)
            System.out.println(dat);//напишите тут ваш код
    }
}
