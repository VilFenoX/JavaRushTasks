package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }
        System.out.println(list.toString());
        String[] array = list.toArray(new String[0]);
        //System.out.println(array.toString());
        sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }
    public static void sort(String[] array) {
        ArrayList<String> words = new ArrayList<>();
       ArrayList<Integer> nums = new ArrayList<>();

       for(int i = 0; i < array.length; i++){
           if(isNumber(array[i])){
               nums.add(Integer.valueOf(array[i]));
           }
           else {
                words.add(array[i]);
            }
        }
       for (int i = 0; i < words.size(); i++){
           for (int j = 0; j < words.size()-i-1; j++){
                if (isGreaterThan(words.get(j), words.get(j+1))){
                    String temp = words.get(j);
                    words.set(j,words.get(j+1));
                   words.set(j+1, temp);
               }
            }
       }
       for (int i = 0; i < nums.size(); i++){
           for (int j = 0; j < nums.size()-i-1; j++){
               if(nums.get(j) < nums.get(j+1)){
                   int temp = nums.get(j);
                   nums.set(j, nums.get(j+1));
                   nums.set(j+1,temp);
               }
            }
       }
        int num_indx = 0;
       int word_indx = 0;

       for(int i = 0; i < array.length; i++){
           if(isNumber(array[i])){
                array[i] = String.valueOf(nums.get(num_indx));
               num_indx++;
           }
            else {
                array[i] = words.get(word_indx);
                word_indx++;
           }
        }
    }
    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {

        return a.compareTo(b) > 0;
    }
    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
