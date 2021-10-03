package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i<20; i++) {
            list.add(i);
        }// напишите тут ваш код
return list;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> set2 = new HashSet<>();
        for (int a : set){
            if (a>10){
                set2.add(a);
            }
        }
        set.removeAll(set2);// напишите тут ваш код
return set;
    }

    public static void main(String[] args) {

    }
}
