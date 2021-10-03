package com.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            Money usd = new USD(463.35);//напишите тут ваш код
            Money ruble = new Ruble(63.35);//напишите тут ваш код
            Money hrivna = new Hrivna(3.35);
            allMoney.add(usd);//напишите тут ваш код
            allMoney.add(ruble);//напишите тут ваш код
            allMoney.add(hrivna);//напишите тут ваш код
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
