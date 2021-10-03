package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//Принимаем имя файла с консоли
        String string = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<Integer>();

        FileInputStream fileInputStream = new FileInputStream(string);
        //FileInputStream fileInputStream = new FileInputStream(new File("F:/Hobbi/Java/JavaRush/output.txt"));
        int temp;
        int count = 0;

        while (fileInputStream.available() > 0){// пока еще байты остались делаем то то
            int data = fileInputStream.read();
            list.add(data);
        }
        fileInputStream.close();
        //закрываем поток
        Set<Integer> set=new LinkedHashSet<>(list);
        Set<Integer> sortedSet = new TreeSet<Integer>();
        sortedSet.addAll(set);
        Iterator iterator = sortedSet.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

    }
}
