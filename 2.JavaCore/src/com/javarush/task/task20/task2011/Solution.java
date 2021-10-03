package com.javarush.task.task20.task2011;

import java.io.*;

/* 
Externalizable для апартаментов
*/

public class Solution {

    public static class Apartment implements Externalizable{

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);

        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        address = (String) in.readObject();
        year = in.readInt();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //save cat to file
        FileOutputStream fileOutput = new FileOutputStream("F:/Hobbi/Java/JavaRush/output.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
       Apartment apartment = new Apartment();
       apartment.writeExternal(outputStream);
        fileOutput.close();
        outputStream.close();


        //load cat from file
        FileInputStream fiStream = new FileInputStream("F:/Hobbi/Java/JavaRush/input.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        apartment.readExternal(objectStream);
        objectStream.close();
        fiStream.close();
    }
}
