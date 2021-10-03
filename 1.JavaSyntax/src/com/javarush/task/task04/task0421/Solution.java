package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s1 = scanner.next();
        if (s.equals(s1))
            System.out.println("Имена идентичны");
        else if (s.length() == s1.length())
            System.out.println("Длины имен равны");


    }
}
