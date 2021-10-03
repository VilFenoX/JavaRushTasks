package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> list = new HashMap<>();
        //List<String> list = new ArrayList<>();
        while (true) {

            String sity = reader.readLine();
            if (sity.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.put(sity, family);
        }

        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());
        //System.out.println("gorod");
        String sityCount = reader.readLine();

        for (Map.Entry<String, String> pair : list.entrySet()) {
            if (pair.getKey().equals(sityCount)) {
                System.out.println(pair.getValue());
            }
        }

    }
}
