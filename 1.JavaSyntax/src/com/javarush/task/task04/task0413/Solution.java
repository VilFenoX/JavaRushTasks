package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
       if (number <1 || number>7)
           System.out.println("такого дня недели не существует");
       else
           switch (number) {
               case 1:
                   System.out.println("понедельник");
                   break;
               case 2:
                   System.out.println("вторник");
                   break;
               case 3:
                   System.out.println("среда");
                   break;
               case 4:
                   System.out.println("четверг");
                   break;
               case 5:
                   System.out.println("пятница");
                   break;
               case 6:
                   System.out.println("суббота");
                   break;
               case 7:
                   System.out.println("воскресенье");
                   break;
           }

    }
}