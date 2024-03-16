package org.example;

public class List<T> {
    private Node<T> head; // Pointer to the first node in the list
    private int size;     // Number of elements in the list

    // Constructor to initialize an empty list
    public List() {
        this.head = new Node<>(); // Create a dummy node as the head
        this.size = 0;             // Initialize the size to 0
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return head.getNext() == null; // If head's next pointer is null, the list is empty
    }

    // Method to get the size of the list
    public int getSize() {
        return size; // Return the current size of the list
    }

    // Method to add a new node with the specified value to the end of the list
    public void addToEnd(T value) {
        Node<T> newNode = new Node<>(); // Create a new node
        newNode.setValue(value);        // Set its value

        Node<T> current = head; // Start from the head
        // Traverse the list to find the last node
        while (current.getNext() != null) {
            current = current.getNext();
        }
        // Set the next pointer of the last node to the new node
        current.setNext(newNode);
        size++; // Increase the size of the list
    }

    // Method to add a new node with the specified value to the beginning of the list
    public void prepend(T value) {
        Node<T> newNode = new Node<>(); // Create a new node
        newNode.setValue(value);        // Set its value
        // Set the next pointer of the new node to the current first node
        newNode.setNext(head.getNext());
        // Set the head's next pointer to the new node, making it the new first node
        head.setNext(newNode);
        size++; // Increase the size of the list
    }

    // Method to print the values of all nodes in the list
    public void printValues() {
        Node<T> current = head.getNext(); // Start from the first node
        System.out.print("List values: ");
        // Traverse the list and print the value of each node
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext(); // Move to the next node
        }
        System.out.println(); // Print a new line after printing all values
    }
}
