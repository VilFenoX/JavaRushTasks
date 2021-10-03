package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика"); //напишите тут ваш код
        set.add("женьшень"); //напишите тут ваш код
        set.add("земляника"); //напишите тут ваш код
        set.add("ирис"); //напишите тут ваш код
        set.add("картофель"); //напишите тут ваш код
    for (String o : set)
        System.out.println(o);
    }
}
