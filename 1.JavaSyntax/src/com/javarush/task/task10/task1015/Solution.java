package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Collections;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {

        ArrayList<String>[] arrayOfStringList = new ArrayList[3] ;
        arrayOfStringList[0]=new ArrayList<>();
        arrayOfStringList[1]=new ArrayList<>();
        arrayOfStringList[2]=new ArrayList<>();
        Collections.addAll(arrayOfStringList[0],"fgfg");
        Collections.addAll(arrayOfStringList[1],"fgfgere");
        Collections.addAll(arrayOfStringList[2],"fgftrztg");
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}