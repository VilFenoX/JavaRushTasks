package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        int[] number = {1, 2, 3, 4, 5};
        int[] number1 = {1, 2};
        int[] number2 = {1, 2, 3, 4};
        int[] number3 = {1, 2, 3, 4, 5, 6, 7};
        int[] number4 = {};
        ArrayList<int[]> listInt = new ArrayList<>();
        listInt.add(number);
        listInt.add(number1);
        listInt.add(number2);
        listInt.add(number3);
        listInt.add(number4);
        return listInt;//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
