package com.javarush.task.task20.task2007;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Как сериализовать JavaRush?
*/

public class Solution {

    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        JavaRush javaRush= new JavaRush();

        //save cat to file
        FileOutputStream fileOutput = new FileOutputStream("F:/Hobbi/Java/JavaRush/output.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(javaRush);
        fileOutput.close();
        outputStream.close();

        //load cat from file
        FileInputStream fiStream = new FileInputStream("F:/Hobbi/Java/JavaRush/input.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        Object object = objectStream.readObject();
        fiStream.close();
        objectStream.close();

        JavaRush JavaRush1 = (JavaRush) object;
    }
}
