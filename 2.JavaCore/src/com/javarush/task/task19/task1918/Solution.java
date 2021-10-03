package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(bufferedReader.readLine()));
       // BufferedReader bufferedReader1 = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/input.txt"));
        StringBuilder text = new StringBuilder();
        while (bufferedReader1.ready()) {
            text = text.append(bufferedReader1.readLine());

        }

        //  F:/Hobbi/Java/JavaRush/input.txt
        bufferedReader.close();
        bufferedReader1.close();
        // Pattern pattern = Pattern.compile("<" + args[0] + "[.]*</"+ args[0]+ ">" );
        //  Matcher m = Pattern.compile("<" + args[0] + "[.*]</"+ args[0]+ ">").matcher(text);
        Map <Integer, Integer> tagIndices = new TreeMap<>();
        //final String fileString = sb.toString().replaceAll("[\\n\\r]", ""); this line is redundant. readLine (line 25) does all this work!
        Matcher m = Pattern.compile("(<\\s*/?\\s*" + args[0] + ".*?>)").matcher(text);
        while (m.find()){ //if an opening OR closing tag has been found, we go inside while loop
            if (m.group().matches("<\\s*" + args[0] + ".*?>")) //if found group is an opening tag then
                tagIndices.put(m.start(), null);                 //we create new pair: {found index, null}
            else {                                               // if found group is a closing tag then
                Integer openingTag = null;                       // we search for last beginning index, which has null value.
                for (Integer i : tagIndices.keySet())            //here we're going over all found beginning indices
                    if (tagIndices.get(i) == null)
                        openingTag = i;                          //and saving the last of those, which value equals null.
                tagIndices.put(openingTag, m.end());
            }
        }
        for (Map.Entry<Integer, Integer> entry : tagIndices.entrySet())
            System.out.println(text.substring(entry.getKey(), entry.getValue()));
    }
}
