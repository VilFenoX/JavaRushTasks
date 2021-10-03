package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
private FileOutputStream outputStream;
    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.outputStream = fileOutputStream;
    }

    public void close() throws IOException {
        this.outputStream.flush();
        String data =  "JavaRush © All rights reserved.";
        InputStream is = new ByteArrayInputStream(data.getBytes());
        byte[] buffer = new byte[is.available()];
        is.read(buffer);
        this.outputStream.write(buffer);
        is.close();
        outputStream.close();


    }
    public void flush() throws IOException {
        outputStream.flush();
    }
    public void write(byte[] b) throws IOException {
        outputStream.write(b);
    }
    public void write(byte[] b, int off, int len) throws IOException {
        outputStream.write(b, off, len);
    }
    public void write(int b) throws IOException {
        outputStream.write(b);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
