package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        List<Integer> rezult = new ArrayList();
       for (int i = 0; i<10; i++) {
           list.add(scanner.nextInt());//напишите тут ваш код
       }
       int count = 1;
       for (int i=0; i<list.size()-1; i++){
           if ((int)list.get(i) == (int)list.get(i+1)){
               count++;
           rezult.add(count);}
           else {
               count = 1;
               rezult.add(count);
           }
       }
        System.out.println(Collections.max(rezult));
    }
}