package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();//add your code here - добавьте код тут
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
       BufferedReader bufferedReader= new BufferedReader( new InputStreamReader(System.in));
       String line = bufferedReader.readLine();
       if(line.equals("helicopter")){
           result = new Helicopter();
       } else  if(line.equals("plane")){
           result = new Plane(bufferedReader.read());
       }//add your code here - добавьте код тут
    bufferedReader.close();
    }

}
