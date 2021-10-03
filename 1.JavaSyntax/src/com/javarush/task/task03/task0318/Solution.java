package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
      // System.out.println("Введите возраст");
       int age = scanner.nextInt();//напишите тут ваш код
       //System.out.println("Введите имя");
       String name = scanner.next();

       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Введите возраст");
        //String sAge = reader.readLine();
        //int age = Integer.parseInt(sAge);
        //System.out.print("Введите имя");
        //String name = reader.readLine();
        System.out.print(name + " " +"захватит мир через"+ " " +age+ " " + "лет. Му-ха-ха!");


    }
}
