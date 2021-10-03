package com.javarush.task.task09.task0922;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       String dateNow = scanner.nextLine();
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       //dateFormat.applyPattern();
       Date date = dateFormat.parse(dateNow);
      SimpleDateFormat formatedDate = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(formatedDate.format(date).toUpperCase());
    }
}
