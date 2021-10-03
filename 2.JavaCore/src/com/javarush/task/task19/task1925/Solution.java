package com.javarush.task.task19.task1925;

import java.io.*;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {

       BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(args[0]));
        //BufferedReader bufferedReaderFile = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/input.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(args[1]));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:/Hobbi/Java/JavaRush/output.txt",true));
        StringBuilder sb = new StringBuilder();
        while (bufferedReaderFile.ready()) {
            String[] ss = bufferedReaderFile.readLine().split(" ");
            for (String s : ss)
                if (s.length() > 6)
                    sb.append(s + ",");
        }
        bufferedWriter.write(sb.delete(sb.length() - 1, sb.length()).toString());
    bufferedReaderFile.close();
    bufferedWriter.close();
    }
}
