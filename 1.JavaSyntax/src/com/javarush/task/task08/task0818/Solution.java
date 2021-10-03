package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1000);//напишите тут ваш код
        map.put("two", 200);//напишите тут ваш код
        map.put("tree", 1200);//напишите тут ваш код
        map.put("four", 300);//напишите тут ваш код
        map.put("seven", 1400);//напишите тут ваш код
        map.put("eight", 456);//напишите тут ваш код
        map.put("five", 345);//напишите тут ваш код
        map.put("six", 2345);//напишите тут ваш код
        map.put("nane", 23545);//напишите тут ваш код
        map.put("ten", 2);//напишите тут ваш код
        return map; //напишите тут ваш код //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue()<500) {
                map.remove(pair.getKey());
            }
        }
        //System.out.println(map.toString());//напишите тут ваш код
    }

    public static void main(String[] args) {
    removeItemFromMap(createMap());
    }
}