package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> list = new HashMap<String, Cat>();
        list.put("vaskaa", new Cat("a"));
        list.put("vaskas", new Cat("s"));
        list.put("vaskad", new Cat("d"));
        list.put("vaskaf", new Cat("f"));
        list.put("vaskag", new Cat("g"));
        list.put("vaskah", new Cat("h"));
        list.put("vaskaj", new Cat("j"));
        list.put("vaskak", new Cat("k"));
        list.put("vaskal", new Cat("l"));
        list.put("vaskav", new Cat("v"));
        return list;//напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> setList = new HashSet<Cat>();
        for (Map.Entry<String, Cat> s : map.entrySet()) {
            setList.add(s.getValue());
        }
        return setList;//напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {

            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}



