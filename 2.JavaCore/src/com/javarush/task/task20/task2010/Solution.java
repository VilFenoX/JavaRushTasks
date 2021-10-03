package com.javarush.task.task20.task2010;

import java.io.*;

/* 
Как сериализовать что-то свое?
*/

public class Solution {
    public static class Object implements Serializable{
        public String string1;
        public String string2;
    }

    public static int stringCount;

    public static class String implements Serializable{
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Object object= new Object();

        //save cat to file
        FileOutputStream fileOutput = new FileOutputStream("F:/Hobbi/Java/JavaRush/output.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(object);
        fileOutput.close();
        outputStream.close();


        //load cat from file
        FileInputStream fiStream = new FileInputStream("F:/Hobbi/Java/JavaRush/input.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        Object second = (Object) objectStream.readObject();
        fiStream.close();
        objectStream.close();

    }
}
