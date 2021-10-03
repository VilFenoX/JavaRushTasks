package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        byte[] buffNoEncrypt = new byte[fileInputStream.available()];
        byte[] buffEncrypt = new byte[fileInputStream.available()];

        while (fileInputStream.available()>0){
            fileInputStream.read(buffNoEncrypt);
        }
        fileInputStream.close();
        // FileInputStream fileInputStream = new FileInputStream(new File("F:/Hobbi/Java/JavaRush/input.txt"));
        // FileOutputStream fileOutputStream2 = new FileOutputStream(new File("F:/Hobbi/Java/JavaRush/output.txt"));
switch (args[0]){
    case ("-e"):
        new Solution().encrypt(buffNoEncrypt, buffEncrypt);
        fileOutputStream.write(buffEncrypt);
        fileOutputStream.close();
        break;
    case ("-d"):
        new Solution().decrypt(buffNoEncrypt, buffEncrypt);
        fileOutputStream.write(buffEncrypt);
        fileOutputStream.close();
        break;
    }
    }
    private void reverse(byte[] noRevers, byte[] revers){

        int j = 0;
        for (int i = noRevers.length-1; i>=0;i--){
            revers[j] = noRevers[i];
            j++;
        }
    }
private void encrypt(byte[] noEncrypt, byte[] encrypt){
       reverse(noEncrypt, encrypt);
}
private void decrypt(byte[] encrypt, byte[] noEncrypt){
       reverse(encrypt, noEncrypt);
}
}

