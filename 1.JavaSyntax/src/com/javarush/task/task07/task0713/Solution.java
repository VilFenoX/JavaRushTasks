package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<Integer> list = new ArrayList<Integer>(); //напишите тут ваш код
       ArrayList<Integer> list3 = new ArrayList<Integer>(); //напишите тут ваш код
       ArrayList<Integer> list2 = new ArrayList<Integer>(); //напишите тут ваш код
       ArrayList<Integer> listOther = new ArrayList<Integer>();
       Scanner scanner = new Scanner(System.in);
       for (int i = 0;i<20;i++){
           list.add(scanner.nextInt());
       }
       for (int i =0; i<list.size();i++){
           if (list.get(i)%2==0 && list.get(i)%3==0){
               list2.add(list.get(i));
               list3.add(list.get(i));
           }
           else if (list.get(i)%3==0)
               list3.add(list.get(i));
           else if (list.get(i)%2==0)
               list2.add(list.get(i));
           else listOther.add(list.get(i));
       }
       printList(list2);//напишите тут ваш код
       printList(list3);//напишите тут ваш код
       printList(listOther);//напишите тут ваш код
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer print : list){
            System.out.println(print);
        }//напишите тут ваш код

    }
}
