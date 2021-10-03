package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws MalformedURLException {
        String line = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            line=reader.readLine();
        } catch (NumberFormatException | IOException nfe) {
        }
        //String line = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        //String line2 = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";


        Pattern pattern = Pattern.compile("(?<=[?&])\\w+(?=[=&])"); //все бувыенные и числовые символы между ?& и =&
        Matcher matcher1 = pattern.matcher(line);
       
        Pattern pattern2 = Pattern.compile("(?<=(obj=))(\\w+[.]?\\w+)");
        Matcher matcher2 = pattern2.matcher(line);
        try {
            while (matcher1.find()) { System.out.print(matcher1.group() + " "); }
            System.out.println();
            while (matcher2.find()) { alert(Double.parseDouble(matcher2.group())); }
        } catch (NumberFormatException nfe) { alert(matcher2.group()); }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
