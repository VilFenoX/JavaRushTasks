package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isTrue = true;
        while (isTrue) {
            FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        if(fileInputStream.available() <1000){
            isTrue=false;
            fileInputStream.close();
            throw new DownloadException();
        }
        }
        reader.close();
    }

    public static class DownloadException extends Exception {

    }
}
