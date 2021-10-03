package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg z1 = new Zerg();
        z1.name = "Августин";
        Zerg z2 = new Zerg();
        z2.name = "Олег";
        Zerg z3 = new Zerg();
        z3.name = "Григорий";
        Zerg z4 = new Zerg();
        z4.name = "Алексей";
        Zerg z5 = new Zerg();
        z5.name = "Костя";
        Protoss p1 = new Protoss();
        p1.name = "Федор";
        Protoss p2 = new Protoss();
        p2.name = "Коля";
        Protoss p3 = new Protoss();
        p3.name = "Ваня";
        Terran t1 = new Terran();
        t1.name = "Саша";
        Terran t2 = new Terran();
        t2.name = "Лена";
        Terran t3 = new Terran();
        t3.name = "Катя";
        Terran t4 = new Terran();
        t4.name = "Маша";

        //напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
