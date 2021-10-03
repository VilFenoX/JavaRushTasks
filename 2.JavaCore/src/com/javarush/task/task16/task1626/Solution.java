package com.javarush.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        //Date date1 = new Date();

        new Thread(new CountUpRunnable(), "Увеличиваем").start();
        //Date date2 = new Date();
        //System.out.println("" + (date2.getTime() - date1.getTime()));
    }

    public static class CountUpRunnable implements Runnable{
        private int countIndexDown = 0;
        @Override
        public void run() {
            try {
                while (true) {

                    countIndexDown += 1;
                    System.out.println(toString());
                    Thread.sleep(500);
                    if (countIndexDown == Solution.number) return;

                }
            } catch (InterruptedException e) {
            }
        }
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }//Add your code here - добавь код тут
    }


    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
