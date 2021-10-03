package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
   public static void main(String[] args) throws IOException {
//       BufferedReader reader = new BufferedReader(new FileReader(new File("C:/debug.txt")));
//       String line = null;
//       while ((line = reader.readLine()) != null){
//           System.out.println(line);
//       }
//       reader.close();// напишите тут ваш код
       Scanner scanner = new Scanner(System.in);
     BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); //чтение с консоли
      //InputStream inStream = new FileInputStream("F:/Hobbi/Java/JavaRush/input.txt"); // чтениес файла
      InputStream inStream = new FileInputStream(scanner.nextLine());
       BufferedReader bif = new BufferedReader(new InputStreamReader(inStream));
      while (bif.ready()){
          // char data = (char) inStream.read();
           System.out.println(bif.readLine());
       }
       inStream.close();
       bif.close();
   }
}