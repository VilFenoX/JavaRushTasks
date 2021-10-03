package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        String name = "Иванов Иван Иванович 13 09 1993";

        PersonScannerAdapter adapter = new PersonScannerAdapter(new Scanner(name));

        System.out.println(adapter.read());
    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String[] data = fileScanner.nextLine().trim().split(" ", 4);
            SimpleDateFormat formatter = new SimpleDateFormat("d M y", Locale.ENGLISH);
            Date data1 = formatter.parse(data[3]);


            return new Person(data[1], data[2], data[0], data1);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
