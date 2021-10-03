package com.javarush.task.task18.task1812;


/* 
Расширяем AmigoOutputStream
*/

import java.io.IOException;
import java.util.Scanner;

public class QuestionFileOutputStream implements AmigoOutputStream {
AmigoOutputStream amigoOutputStream;
Scanner scanner = new Scanner(System.in);
    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        if (scanner.nextLine().equals("Д")) {
        amigoOutputStream.close();
    }
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
amigoOutputStream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
amigoOutputStream.write(b,off,len);
    }

}

