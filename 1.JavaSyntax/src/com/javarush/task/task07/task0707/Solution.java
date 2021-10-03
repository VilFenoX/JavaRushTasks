package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<String>();
        String a = "111";
        String b = "222";
        String c = "333";
        String d = "444";
        String e = "555";
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        System.out.println(list.size());
        for(int i = 0; i<list.size(); i++)
            System.out.println(list.get(i));
        //напишите тут ваш код
    }
}
