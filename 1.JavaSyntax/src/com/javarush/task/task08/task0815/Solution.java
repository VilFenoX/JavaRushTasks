package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "oneName");//напишите тут ваш код
        map.put("two", "oneName");//напишите тут ваш код
        map.put("tree", "oneSix");//напишите тут ваш код
        map.put("four", "oneName");//напишите тут ваш код
        map.put("seven", "oneName");//напишите тут ваш код
        map.put("eight", "oneName");//напишите тут ваш код
        map.put("five", "oneSix");//напишите тут ваш код
        map.put("six", "oneSix");//напишите тут ваш код
        map.put("nane", "oneName");//напишите тут ваш код
        map.put("ten", "oneName");//напишите тут ваш код
return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (name.equals(pair.getValue()))
            //if (pair.getKey().equals(name))
           count++;
        } //напишите тут ваш код
return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (lastName.equals(pair.getKey()))
            //if (pair.getValue().equals(lastName))
                count++;
        } //напишите тут ваш код
        return count;
    }

    public static void main(String[] args) {
       //System.out.println(getCountTheSameFirstName(createMap(), "one"));
       //System.out.println(getCountTheSameLastName(createMap(), "oneSix"));
    }
}
