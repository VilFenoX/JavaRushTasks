package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle() {
    }

    public Circle(double x) {
        this.x = x;
    }

   //

        public Circle(Circle ci, double y) {
        this.x = ci.x;
        this.y = y;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}