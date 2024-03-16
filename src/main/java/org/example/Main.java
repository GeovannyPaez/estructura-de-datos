package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new List<>();
        myList.addToEnd(1);
        myList.addToEnd(2);
        myList.addToEnd(3);
        myList.prepend(0);
        System.out.println(myList.getSize());
        System.out.println(myList.isEmpty());
        myList.printValues(); // Output: List values: 0 1 2 3
        System.out.println("Hello World!");
        System.out.println("This is a simple Java application.");
    }
}