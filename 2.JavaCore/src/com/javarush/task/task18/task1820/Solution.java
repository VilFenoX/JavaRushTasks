package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
      String fileInput = scanner.nextLine();
       String fileOutput = scanner.nextLine();
        //File fileOne = new File("F:/Hobbi/Java/JavaRush/input.txt");
        //File fileTwo = new File("F:/Hobbi/Java/JavaRush/output.txt");
        File fileOne = new File(fileInput);
        File fileTwo = new File(fileOutput);
        FileWriter fileWriter = new FileWriter(fileTwo, true);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileOne));
        String str = "";
        while (bufferedReader.ready()){
            str = bufferedReader.readLine();
        }
        String[] numbers = str.split(" ");
        for (int i = 0; i<numbers.length; i++){
            double data = Double.parseDouble(numbers[i]);
            int rezult = (int) Math.round(data);
            fileWriter.write(rezult + " ");
        }
        bufferedReader.close();
        fileWriter.close();
    }
}
