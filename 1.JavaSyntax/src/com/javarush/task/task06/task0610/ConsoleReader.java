package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();//напишите тут ваш код
return string;
    }

    public static int readInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Int = scanner.nextInt();//напишите тут ваш код
return  Int;//напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double doublee = scanner.nextDouble();//напишите тут ваш код
       return doublee; //напишите тут ваш код

    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean boo = scanner.nextBoolean();
        return boo;//напишите тут ваш код
//напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {

    }
}
