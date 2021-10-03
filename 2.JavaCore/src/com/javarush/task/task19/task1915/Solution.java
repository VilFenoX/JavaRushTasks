package com.javarush.task.task19.task1915;

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
       // Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine());
        bufferedReader.close();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        //  F:/Hobbi/Java/JavaRush/output.txt
        String result = outputStream.toString();

        fileOutputStream.write(outputStream.toByteArray()); //  можно так
        //outputStream.writeTo(fileOutputStream);  // можно и так
fileOutputStream.close();
        System.setOut(consoleStream);
        System.out.println(result);
    }
    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

