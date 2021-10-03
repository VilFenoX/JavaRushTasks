package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(scanner.nextLine()));
        //BufferedReader bufferedReader = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/allLines.txt"));
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            allLines.add(line);
        }
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(scanner.nextLine()));
       // BufferedReader bufferedReader2 = new BufferedReader(new FileReader("F:/Hobbi/Java/JavaRush/forRemoveLines.txt"));
        String line2 = null;
        while ((line2 = bufferedReader2.readLine()) != null){
            forRemoveLines.add(line2);
        }
        bufferedReader.close();
        bufferedReader2.close();
        Solution solution = new Solution();
        solution.joinData();
        
    }
    public void joinData() throws CorruptedDataException {
        if( allLines.containsAll(forRemoveLines) ) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
//    public static void joinData() throws CorruptedDataException {
//        for (int i = 0 ; i < forRemoveLines.size()-1; i++){
//            for (String x: allLines) {
//                if (forRemoveLines.get(i).equals(x)){
//                    allLines.remove(x);
//                    i=0;
//                    break;
//                }else {
//                    //System.out.println(allLines.toString());
//                    for (int j = 0; j<allLines.size()-1; j++){
//                        allLines.set(j, null);
//                    }
//                   // System.out.println(allLines.toString());
//                   // throw new CorruptedDataException();
//                }
//            }
//        }
//    }
}
