package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
   transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\r\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
       // out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
       // in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
Solution solution= new Solution("myFilename.txt");

FileOutputStream fileOutput = new FileOutputStream("myFilenameOutput.txt");
ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
objectOutput.writeObject(solution);

FileInputStream fileInputStream = new FileInputStream("Input.txt");
ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
Solution solutionTWO = (Solution) objectInputStream.readObject();
    }
}
