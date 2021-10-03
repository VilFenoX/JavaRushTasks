package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        //BufferedReader reader = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/input.txt"));
        TreeMap<String, Double> m = new TreeMap<>();

        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");
            if (m.containsKey(s[0])) {
                m.put(s[0], m.get(s[0]) + Double.parseDouble(s[1]));
            } else m.put(s[0], Double.parseDouble(s[1]));
        }

        Double maxValue = Collections.max(m.values());
        for (Map.Entry<String, Double> entry : m.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                System.out.println(entry.getKey());
            }
            reader.close();
        }
    }
}
