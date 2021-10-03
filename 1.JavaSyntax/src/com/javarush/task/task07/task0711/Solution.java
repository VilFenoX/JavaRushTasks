package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            String a = scanner.nextLine();
            list.add(a);
        }
        for (int i=0; i<13; i++) {
            String a = list.get(4);
            list.remove(4);
            list.add(0, a);

        }  for (String num : list){
            System.out.println(num);
        }//напишите тут ваш код
    }
}
