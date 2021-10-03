package com.javarush.task.task08.task0827;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;


/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args)  {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("MMMM d yyyy").toFormatter();
        formatter = formatter.withLocale(Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(date, formatter);
        int day = localDate.getDayOfYear();
        if (day%2!=0){
        return true;}
        else return false;
    }
}
