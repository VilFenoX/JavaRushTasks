package com.javarush.task.task16.task1630;
import java.io.*;
public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static {
       try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
           reader.close();
        } catch (IOException e) {
           e.printStackTrace();
       }
       //firstFileName = "F:/Hobbi/Java/JavaRush/file.txt";
       // secondFileName = "F:/Hobbi/Java/JavaRush/input.txt";
    }//add your code here - добавьте код тут
    public static void main(String[] args) throws InterruptedException, IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }
    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }
    public interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent() throws IOException;
        void join() throws InterruptedException;
        void start();
    }
    public static class ReadFileThread extends Thread  implements ReadFileInterface{
        private String result = "";
        private String fullFileName;

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }
        @Override
        public String getFileContent() throws IOException {
            return result;
        }
        @Override
        public void start() {
            run();
        }
        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(new File(fullFileName)));
                // создаем reader типа буфера новый буфер для чтения
                // (из нового файла для чтения(с новым файлом (имя которого)))
                while (reader.ready()) // пока в reader'е есть что читать
                {
                    result += reader.readLine() + " "; // дописываем строку к filecontent и + пробел
                }
                result = result.trim();
                reader.close(); // закрываем этот ридер
            } catch (IOException e) {
                e.printStackTrace();
            }
    }//add your code here - добавьте код тут
}
}
