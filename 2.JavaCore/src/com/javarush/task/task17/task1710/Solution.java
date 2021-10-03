package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
      if (args[0].equals("-c")&& args[2].equals("м")){
          allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(args[3])));
          System.out.println(allPeople.size()-1);
        } else if(args[0].equals("-c")&& args[2].equals("ж")){
          allPeople.add( Person.createFemale(args[1], new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(args[3])));
          System.out.println(allPeople.size()-1);
      }else if (args[0].equals("-u")&& args[3].equals("м")){
          allPeople.set(Integer.parseInt(args[1]),
                  Person.createMale(args[2], new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(args[4])));
      }else if(args[0].equals("-u")&& args[3].equals("ж")){
          allPeople.set(Integer.parseInt(args[1]),
                  Person.createFemale(args[2], new SimpleDateFormat("dd/MM/y", Locale.ENGLISH).parse(args[4])));
      }else if(args[0].equals("-d") ){
          Person person =  allPeople.get(Integer.parseInt(args[1]));
          person.setName(null);
          person.setBirthDate(null);
          person.setSex(null);
          allPeople.set(Integer.parseInt(args[1]), person);
      }else if(args[0].equals("-i") & allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.FEMALE)){
          Date date = new Date(String.valueOf(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
          System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " ж " +
                  new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH).format(date));
      }else if(args[0].equals("-i") & allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)){
          System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " м " +
                  new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH).format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
      }
    }
}
