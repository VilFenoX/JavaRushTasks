package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
static {
    //Infinity infinity = new Infinity();
    threads.add(new Infinity());
    //Interrupted interrupted = new Interrupted();
    threads.add(new Interrupted());
    //Shout shout = new Shout();
    threads.add(new Shout());
   //SendMessage sendMessage = new SendMessage();
   // threads.add(sendMessage);
    threads.add(new SendMessage());
    //ReaderRead readerRead = new ReaderRead();
    threads.add(new ReaderRead());
}
    public static void main(String[] args) throws InterruptedException {

    }
    public static class Infinity extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                    System.out.println("Бесконечный поток");
                } catch (InterruptedException e) {
                    System.out.println("Бесконечный поток прерван");
                }
            }
        }
    }
    public static class Interrupted extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(100);
                System.out.println("поток с интераптом");
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Shout extends Thread{
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    System.out.println("поток Shout прерван");
                }
            }
        }
    }
    public static class SendMessage extends Thread implements Message{
       boolean isRun = true;
        @Override
        public void showWarning() {
            if (isAlive())
                isRun = false;
        }

        @Override
        public void run() {
            while (isRun){

            }
        }
    }
    public static class ReaderRead extends Thread{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int sum;

        @Override
        public void run() {

                try {
                    while (!(input = bufferedReader.readLine()).equals("N")) {
                        sum += Integer.parseInt(input);
                        System.out.println(sum);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}