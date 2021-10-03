package com.javarush.task.task08.task0828;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM");
//       //DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("MMMM").toFormatter();
//        formatter = formatter.withLocale(Locale.ENGLISH);
//        LocalDate localDate = LocalDate.parse(month, formatter);
//        System.out.println(month + " is the " + localDate.getMonthValue() + " month");
        Map<String, Integer> listMonth = new HashMap<>();
        listMonth.put("January", 1);
        listMonth.put("February", 2);
        listMonth.put("March", 3);
        listMonth.put("April", 4);
        listMonth.put("May", 5);
        listMonth.put("June", 6);
        listMonth.put("July", 7);
        listMonth.put("August", 8);
        listMonth.put("September", 9);
        listMonth.put("October", 10);
        listMonth.put("November", 11);
        listMonth.put("December", 12);
        for (Map.Entry<String, Integer> pair : listMonth.entrySet()) {
            if (pair.getKey().equals(month)) {
                System.out.println(month + " is the " + pair.getValue() + " month");
            }
        }
    }
}
