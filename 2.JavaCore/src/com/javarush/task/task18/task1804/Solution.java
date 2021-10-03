package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//Принимаем имя файла с консоли
        String string = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<>();
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
        for(int i = 0; i<list.size(); i++){
            temp = list.get(i);
            for(int x: list){
                if(x == temp){
                    count++;
                }
            }
            map.put(list.get(i),count);
            count=0;
        }
        int minValue = Collections.min(map.values());
        for(Map.Entry entry: map.entrySet()) {
            if(entry.getValue().equals(minValue)){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
