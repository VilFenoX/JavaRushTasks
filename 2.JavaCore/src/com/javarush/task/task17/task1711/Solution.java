package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
    public static void main(String[] args) {
        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                for (int i = 1; i < args.length; i++) {

                    try {
                        String name = args[3 * i - 2]; // арифметическая прогрессия Ai = A1(первый элемент прогрессии) + (i-1) * d(шаг прогрессии)
                        String sex = args[3 * i - 1];  // арифметическая прогрессия Ai = A1(первый элемент прогрессии) + (i-1) * d(шаг прогрессии)
                        String bd = args[3 * i];
                       Solution.add(name,sex,bd); // арифметическая прогрессия Ai = A1(первый элемент прогрессии) + (i-1) *d(шаг прогрессии)
                    } catch (Exception e) {
                        break;
                    }
                }
            }
            case "-u":
              synchronized (allPeople){
                for (int i = 1; i < args.length; i++) {

                    try {
                        String id = args[4 * i - 3];
                        String name = args[4 * i - 2]; // арифметическая прогрессия Ai = A1(первый элемент прогрессии) + (i-1) * d(шаг прогрессии)
                        String sex = args[4 * i - 1];  // арифметическая прогрессия Ai = A1(первый элемент прогрессии) + (i-1) * d(шаг прогрессии)
                        String bd = args[4 * i];
                        Solution.update(id,name,sex,bd); // арифметическая прогрессия Ai = A1(первый элемент прогрессии) + (i-1) *d(шаг прогрессии)
                    } catch (Exception e) {
                        break;
                    }
                }
            }
                break;
            case "-d":
                synchronized (allPeople){
                for (int i = 1; i < args.length; i++) {
                    try {
                        Solution.delete(args[i]);
                    } catch (Exception e) {
                        break;
                    }
                }
               break;
            }
            case "-i":
                synchronized (allPeople) {
                for (int i = 1; i < args.length; i++) {
                    try {
                        Solution.info(args[i]);
                    } catch (Exception e) {
                        break;
                    }
                }
                break;
            }
        }
    }
        private static synchronized void add(String name, String sex, String bd)
                throws ParseException {
            if (sex.equals("м")){
                allPeople.add(Person.createMale(name,
                        new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(bd)));
                System.out.println(allPeople.size()-1);
            }else if (sex.equals("ж")){
                allPeople.add(Person.createFemale(name,
                        new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(bd)));
                System.out.println(allPeople.size()-1);
            }
        }
        private static synchronized void update(String id, String name, String sex, String bd) throws ParseException {
            if (sex.equals("м")){
                allPeople.set(Integer.parseInt(id),
                        Person.createMale(name, new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(bd)));
            }else if (sex.equals("ж")){
                allPeople.set(Integer.parseInt(id),
                        Person.createFemale(name, new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(bd)));
            }
        }
        private static synchronized void delete(String id){
            Person person =  allPeople.get(Integer.parseInt(id));
            person.setName(null);
            person.setBirthDate(null);
            person.setSex(null);
            allPeople.set(Integer.parseInt(id), person);
        }
        private static synchronized void info(String id){
            if( allPeople.get(Integer.parseInt(id)).getSex().equals(Sex.FEMALE)){
                Date date = new Date(String.valueOf(allPeople.get(Integer.parseInt(id)).getBirthDate()));
                System.out.println(allPeople.get(Integer.parseInt(id)).getName() + " ж " +
                        new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH).format(date));
            }else if( allPeople.get(Integer.parseInt(id)).getSex().equals(Sex.MALE)){
                System.out.println(allPeople.get(Integer.parseInt(id)).getName() + " м " +
                        new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(id)).getBirthDate()));
            }
        }
}