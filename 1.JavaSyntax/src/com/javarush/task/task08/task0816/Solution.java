package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("ДиКаприо", dateFormat.parse("JUNE 1 2012"));
        map.put("Кэнеди", dateFormat.parse("JULY 1 2012"));
        map.put("Кэрри", dateFormat.parse("AUGUST 1 2012"));
        map.put("Стетхэм", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Путин", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Петров", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Медведев", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Гус", dateFormat.parse("JANUARY 1 2012"));
        map.put("Гусев", dateFormat.parse("FEBRUARY 1 2012"));
return  map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
       // Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
      //  while(iterator.hasNext()){
          // Map.Entry<String, Date> pair = iterator.next();
      for (Map.Entry<String, Date> pair : map.entrySet())
      {
          if (pair.getValue().getMonth() == Calendar.JULY ||
                   pair.getValue().getMonth() == Calendar.JUNE ||
                   pair.getValue().getMonth() == Calendar.AUGUST)
              map.remove(pair.getKey());
          //iterator.remove();
      }

    }

    public static void main(String[] args) throws ParseException {
removeAllSummerPeople(createMap());
        //System.out.println(createMap().toString());
    }
}
