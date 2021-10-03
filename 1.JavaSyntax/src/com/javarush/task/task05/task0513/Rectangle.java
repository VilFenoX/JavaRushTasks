package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
   int top;
   int left;
   int width = 0;//напишите тут ваш код
    int height = 0;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;

    }
    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        height = this.width;
        System.out.println(height);
    }
    public void initialize(Rectangle rectangle) {

    }

    public static void main(String[] args) {
Rectangle rectangle = new Rectangle();
        rectangle.initialize(5,4,3);
    }
}
