package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(3d,"Str");
        labels.put(4d,"Strw");
        labels.put(5d,"Strs");
        labels.put(6d,"Strx");
        labels.put(7d,"Strfd");
    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
