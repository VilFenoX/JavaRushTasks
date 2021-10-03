package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "oneName");//напишите тут ваш код
        map.put("two", "oneNam");//напишите тут ваш код
        map.put("tree", "oneSix");//напишите тут ваш код
        map.put("four", "oneSeven");//напишите тут ваш код
        map.put("seven", "oneNam");//напишите тут ваш код
        map.put("eight", "oneName");//напишите тут ваш код
        map.put("five", "oneSix");//напишите тут ваш код
        map.put("six", "oneSix");//напишите тут ваш код
        map.put("nane", "oneName");//напишите тут ваш код
        map.put("ten", "oneName");//напишите тут ваш код
        return map; //напишите тут ваш код
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> copy = new ArrayList<>();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            copy.add(pair.getValue());  // в новый массив кпирую значения с мапа
        }
        Set<String> listValue = new HashSet<String>(copy); // вставляем элементы без дубликатов
        for (String value : listValue) {
            for (int i = 0; i < copy.size(); i++) {
                if (copy.get(i).equals(value)) {
                    copy.remove(i);    // оставляю в новом массиве только те значения которые дублируются
                    break;
                }
            }
        }
        for (String value : listValue){
    for (int i = 0; i<copy.size(); i++) {
    if (copy.get(i).equals(value)){  // если идет совпадение уникальных значений с теми которые дублируются. то выполняю метод ниже
        removeItemFromMapByValue(map, value); //
    break;
    }
            }
        }
    }
        public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }//System.out.println(map.toString());
    }
    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
