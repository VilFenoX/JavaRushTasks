package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
static {
    BufferedReader bufferedReader = null;
    try {
        bufferedReader = new BufferedReader(new FileReader(new File(Statics.FILE_NAME)));

    String line;
    while ((line = bufferedReader.readLine()) != null){
        lines.add(line);
    }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public static void main(String[] args) {
        System.out.println(lines);
    }
}
