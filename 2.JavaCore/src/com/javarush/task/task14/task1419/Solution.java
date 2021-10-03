package com.javarush.task.task14.task1419;

import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NullPointerException("Exception: s is null!");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayIndexOutOfBoundsException("INDEX NOT VALID");

        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код//напишите тут ваш код
        try {
            throw new ClassCastException ("parse NOT VALID");

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ConcurrentModificationException("Thread NOT VALID");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new EmptyStackException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NegativeArraySizeException("negative massuf");

        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код//напишите тут ваш код
        try {
            throw new NoSuchElementException  ("not such");

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NumberFormatException("dont parsed");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new SecurityException("Security");

        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
