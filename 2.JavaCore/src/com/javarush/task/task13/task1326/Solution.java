package com.javarush.task.task13.task1326;
/*
Сортировка четных чисел из файла
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = new FileInputStream(scanner.nextLine());
        //InputStream inputStream = new FileInputStream("F:/Hobbi/Java/JavaRush/input.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));// напишите тут ваш код
        ArrayList<Integer> res = new ArrayList<>();
        while (bufferedReader.ready()) {
            String a = bufferedReader.readLine();
               res.add(Integer.parseInt(a));
              // System.out.println(res.toString());
        }
        Collections.sort(res);
            for (int i=0; i<res.size(); i++ ){
                if(res.get(i)%2==0){
                    System.out.println(res.get(i));}
                    else {
                    res.remove(i);
                    i--;
                }
            }
   inputStream.close();
   bufferedReader.close();
    }
}
