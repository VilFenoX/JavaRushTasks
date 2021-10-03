package com.javarush.task.task09.task0923;
import java.util.ArrayList;
import java.util.Scanner;
public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
       line = line.trim(); // удаление пробелов в начале и конце
        line = line.replaceAll(" ", ""); // удаление пробелов
      //  System.out.println(line);
        ArrayList<String> rezVowels = new ArrayList<>();
        ArrayList<String> rezConsonant = new ArrayList<>();
        for (int i = 0; i < line.length(); i++){
            if(isVowel(line.charAt(i))){               // из String В  Char
            rezVowels.add(String.valueOf(line.charAt(i))); // из Char в String
            rezVowels.add(" ");
            }
            else{
                rezConsonant.add(String.valueOf(line.charAt(i)));// из Char в String
            rezConsonant.add(" ");
            }
        }
        for (String res: rezVowels){
            System.out.print(res);
        }
        System.out.println();
        for (String res: rezConsonant){
            System.out.print(res);
        }
    }
    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}