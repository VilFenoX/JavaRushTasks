package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread specialThread1 = new SpecialThread();//Add your code here - добавьте свой код тут
        SpecialThread specialThread2 = new SpecialThread();//Add your code here - добавьте свой код тут
        SpecialThread specialThread3 = new SpecialThread();//Add your code here - добавьте свой код тут
        SpecialThread specialThread4 = new SpecialThread();//Add your code here - добавьте свой код тут
        SpecialThread specialThread5 = new SpecialThread();

        list.add(new Thread(specialThread1));//Add your code here - добавьте свой код тут
        list.add(new Thread(specialThread2));//Add your code here - добавьте свой код тут
        list.add(new Thread(specialThread3));//Add your code here - добавьте свой код тут
        list.add(new Thread(specialThread4));//Add your code here - добавьте свой код тут
        list.add(new Thread(specialThread5));//Add your code here - добавьте свой код тут
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
