package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        min(a,b);
        int f;
        if (a <= b && a <= c && a <= d)
            f = a;
        else
        if (b <= a && b <= c && b <= d)
            f = b;
        else
            if (c <= a && c <= b && c <= d)
            f = c;
            else
                f=d;
        return f;//напишите тут ваш код//напишите тут ваш код

    }

    public static int min(int a, int b) {
        int e;
        if (a < b)
            e=a;
        else
            e=b;
        return e;//напишите тут ваш код

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}