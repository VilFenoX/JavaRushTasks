package com.javarush.task.task06.task0621;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName, null, null);
        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName, null, null);
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);
        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }
    public static class Cat {
        private String name;
        private  Cat parent;
        private  Cat grandparent;
        Cat(String name, Cat parent, Cat grandparent) {
            this.name = name;
            this.parent = parent;
            this.grandparent = grandparent;
        }
        @Override
        public String toString() {
            if (parent == null && grandparent==null)
                return "The cat's name is " + name + ", no mother, no father";
            else if(grandparent == null && parent !=null)
                return "The cat's name is " + name + ", mother is " + parent.name + ", no father";
            else if(parent == null && grandparent !=null)
                return "The cat's name is " + name + ", no mother, father is " + grandparent.name;
                else return "The cat's name is " + name + ", mother is " + parent.name + " father is " + grandparent.name;
        }
    }
}
