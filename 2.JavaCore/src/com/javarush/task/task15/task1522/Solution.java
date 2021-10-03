package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {


        //String planet ="sun";
    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
        System.out.println(thePlanet);
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scanner = new Scanner(System.in);
        String  planet = scanner.nextLine();
       if (planet.equals(Earth.EARTH)){
           thePlanet=Earth.getInstance();
       }else if (planet.equals(Earth.MOON)){
           thePlanet= Moon.getInstance();
       }else if (planet.equals(Earth.SUN)){
           thePlanet=Sun.getInstance();
       }else thePlanet = null;// implement step #5 here - реализуйте задание №5 тут
    }
}
