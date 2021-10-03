package com.javarush.task.task10.task1012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');


       ArrayList<String> list = new ArrayList<String>();
       for (int i = 0; i < 10; i++) {
         String s = scanner.nextLine();
          list.add(s.toLowerCase());
      }



        for (Character character : alphabet){
            int n = 0;
            for (int i = 0; i < list.size(); i++){
                char[] chars = list.get(i).toCharArray();
                for (int j = 0; j < chars.length; j++){
                    if (chars[j] == character){
                        n++;
                    }
                }
            }
            System.out.println(character + " " + n);
        }
}
}
