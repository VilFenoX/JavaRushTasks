package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {


            Scanner scanner = new Scanner(System.in);
            int a=Integer.parseInt(scanner.nextLine());
            int b=Integer.parseInt(scanner.nextLine());
if(a<=0 || b<=0){
    throw new NumberFormatException();
}
            while (b !=0) {
                int tmp = a%b;
                a = b;
                b = tmp;
            }
            System.out.println(a);

    }
}
