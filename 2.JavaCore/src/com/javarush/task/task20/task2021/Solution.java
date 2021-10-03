package com.javarush.task.task20.task2021;

        import java.io.*;

/*
Сериализация под запретом
*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream out) throws IOException{
            throw new NotSerializableException("Not Today");
        }
        private void readObject(ObjectInputStream out) throws IOException{
            throw new NotSerializableException("Not Today");
        }
    }

    public static void main(String[] args) {

    }
}
