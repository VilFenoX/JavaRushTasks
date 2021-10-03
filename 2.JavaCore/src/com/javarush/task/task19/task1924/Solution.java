package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
static {
    map.put(0,"ноль");
    map.put(1,"один");
    map.put(2,"два");
    map.put(3,"три");
    map.put(4,"четыре");
    map.put(5,"пять");
    map.put(6,"шесть");
    map.put(7,"семь");
    map.put(8,"восемь");
    map.put(9,"девять");
    map.put(10,"десять");
    map.put(11,"одиннадцать");
    map.put(12,"двенадцать");
}
    public static void main(String[] args) throws IOException {
       // F:/Hobbi/Java/JavaRush/input.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fReader = new FileReader(reader.readLine());
        reader.close();
        reader = new BufferedReader(fReader);
        String line;
        while ((line = reader.readLine()) != null) {
            for (Map.Entry entry : map.entrySet()) {
                Pattern pattern = Pattern.compile("\\b(" + entry.getKey() + ")\\b");
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    line = matcher.replaceAll((String) entry.getValue());
                }
            }
            System.out.println(line);
        }
        fReader.close();
        reader.close();
    }
}
