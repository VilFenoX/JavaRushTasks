package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        // F:/Hobbi/Java/JavaRush/file.txt
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> lineList = new ArrayList<>();
        if(args.length==0){
            return;
        }
        else if(args[0].equals("-u")){
            while (bufferedReader.ready()) {
                lineList.add(bufferedReader.readLine());
            }
            for(int i = 0 ; i<lineList.size(); i++){
                if(lineList.get(i).substring(0,8).trim().equals(args[1])) {
                 String data = String.format("%-8.8s%-30.30s%-8.8s%-4.4s",args[1],args[2],args[3],args[4]);
                    lineList.set(i, data);
                    break;
                }
            }
            bufferedReader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String x: lineList
            ) {
                writer.write(x);
                writer.newLine();
            }
            writer.close();
        }
        else if(args[0].equals("-d")){
       while (bufferedReader.ready()) {

           lineList.add(bufferedReader.readLine());
       }
           for(int i = 0 ; i<lineList.size(); i++){
               if(lineList.get(i).startsWith(args[1])) {
                   lineList.remove(i);
                   break;
               }
           }
           bufferedReader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String x: lineList
                 ) {
                writer.write(x);
                writer.newLine();
            }
                writer.close();
        }
    }
}
