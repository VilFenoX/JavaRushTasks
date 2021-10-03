package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {

        Properties properties = new Properties();
        properties.putAll(runtimeStorage);
        properties.store(outputStream, "");

        }//напишите тут ваш код
    public static void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        runtimeStorage.putAll((Map)properties);
         //напишите тут ваш код
    }
    public static void main(String[] args) {
        //F:/Hobbi/Java/JavaRush/input.txt
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fis = new FileInputStream(reader.readLine())
            // FileInputStream fis = new FileInputStream("F:/Hobbi/Java/JavaRush/input.txt");
             //FileOutputStream fos = new FileOutputStream("F:/Hobbi/Java/JavaRush/output.txt")
        )
        {
            load(fis);
            //save(fos);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(runtimeStorage);
    }
}
