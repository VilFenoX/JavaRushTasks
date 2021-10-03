package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "oneName");//напишите тут ваш код
        map.put("two", "oneNam");//напишите тут ваш код
        map.put("two", "oneSix");//напишите тут ваш код
        map.put("four", "oneSeven");//напишите тут ваш код
        map.put("seven", "oneNam");//напишите тут ваш код
        map.put("eight", "oneName");//напишите тут ваш код
        map.put("five", "oneSix");//напишите тут ваш код
        map.put("six", "oneSix");//напишите тут ваш код
        map.put("six", "oneName");//напишите тут ваш код
        map.put("ten", "oneName");//напишите тут ваш код
        return map; //напишите тут ваш код//напишите тут ваш код

    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
