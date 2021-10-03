package com.javarush.task.task20.task2009;

import java.io.*;

/* 
Как сериализовать static?
*/

public class Solution {
    public static class ClassWithStatic implements Serializable{
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(staticString);
        }
        private void readObject(ObjectInputStream stream)
                throws IOException, ClassNotFoundException {
            stream.defaultReadObject();
            staticString = (String) stream.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClassWithStatic classWithStatic= new ClassWithStatic();

        //save cat to file
        FileOutputStream fileOutput = new FileOutputStream("F:/Hobbi/Java/JavaRush/output.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(classWithStatic);
        fileOutput.close();
        outputStream.close();


        //load cat from file
        FileInputStream fiStream = new FileInputStream("F:/Hobbi/Java/JavaRush/input.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        ClassWithStatic second = (ClassWithStatic) objectStream.readObject();
        System.out.println(ClassWithStatic.staticString);
        fiStream.close();
        objectStream.close();

    }
}
