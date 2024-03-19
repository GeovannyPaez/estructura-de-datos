package org.example;
import org.example.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new List<>();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add to end");
            System.out.println("2. Prepend");
            System.out.println("3. Print values");
            System.out.println("4. Get size");
            System.out.println("5. Check if empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add to end: ");
                    int value1 = scanner.nextInt();
                    myList.addToEnd(value1);
                    break;
                case 2:
                    System.out.print("Enter value to prepend: ");
                    int value2 = scanner.nextInt();
                    myList.prepend(value2);
                    break;
                case 3:
                    myList.printValues();
                    break;
                case 4:
                    System.out.println("Size of the list: " + myList.getSize());
                    break;
                case 5:
                    System.out.println("Is the list empty? " + myList.isEmpty());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
