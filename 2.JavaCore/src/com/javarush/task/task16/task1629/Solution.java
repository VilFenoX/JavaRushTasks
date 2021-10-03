package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();//add your code here - добавьте код тут
        t2.start();
        t2.join();//add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread{
        public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String lineAll;
        @Override
        public void run() {
            try {
                String line1 = reader.readLine();
                String line2 = reader.readLine();
                String line3 = reader.readLine();
                lineAll = line1 + " " + line2 + " " + line3;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        public void printResult(){
            System.out.println(lineAll);
        }
    }//add your code here - добавьте код тут
}
