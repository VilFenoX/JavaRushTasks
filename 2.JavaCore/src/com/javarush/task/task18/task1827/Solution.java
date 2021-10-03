package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if(args.length==0){
            return;
        }
        else if(args[0].equals("-c")){

            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();
            // F:/Hobbi/Java/JavaRush/file.txt
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            int id;
            int max = 0;
            while (bufferedReader.ready()){
                id = Integer.parseInt(bufferedReader.readLine().substring(0,8).trim());
                if (id > max) max = id;
            }
            bufferedReader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.newLine();
            writer.write(String.format("%-8d%-30.30s%-8.8s%-4.4s",++max,args[1],args[2],args[3]));
            writer.close();
        }
    }

}
