package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();// Считать строки с консоли и объявить ArrayList list тут
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<10; i++) {
            list.add(scanner.nextLine());
        }
        ArrayList<String> result = doubleValues(list);

        for (String print:list)
            System.out.println(print);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i<list.size(); i++){
            list.add(i,list.get(i));
            i++;
        }//напишите тут ваш код
        return list;
    }
}
