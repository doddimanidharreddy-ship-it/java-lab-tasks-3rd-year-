// Java Program to Implement Singly Linked List
// With Insert, Delete, and Display operations
public class LinkedList {

    // Node class representing each element in the linked list
    static class Node {
        int data;    // Data value stored in the node
        Node next;   // Reference (pointer) to the next node

        // Constructor to create a new node with given data
        Node(int data)
        {
            this.data = data;
            this.next = null; // Initially next is null
        }
    }

    // Head node points to the first node of the list
    Node head;

    // Method to insert a new node at the end of the list
    void insertAtEnd(int data)
    {
        // Create new node with the given data
        Node newNode = new Node(data);

        // If list is empty, new node becomes the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node of the list
        Node current = head;
        while (current.next != null)
            current = current.next;

        // Link new node at the end of the list
        current.next = newNode;
    }

    // Method to delete a node with the given key value
    void deleteNode(int key)
    {
        // If list is empty, nothing to delete
        if (head == null)
            return;

        // If the head node itself holds the key
        if (head.data == key) {
            head = head.next; // Move head to next node
            return;
        }

        // Traverse to find the node just before the node to delete
        Node current = head;
        while (current.next != null && current.next.data != key)
            current = current.next;

        // If key was not found in the list
        if (current.next == null)
            return;

        // Skip (unlink) the node to be deleted
        current.next = current.next.next;
    }

    // Method to display all elements of the linked list
    void displayList()
    {
        // Start traversal from head node
        Node current = head;

        System.out.print("Linked List: ");

        // Traverse and print each node's data
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        // Print NULL to indicate end of list
        System.out.println("NULL");
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Create new linked list object
        LinkedList list = new LinkedList();

        // Insert elements at end of the list
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        // Display original linked list
        list.displayList();

        // Delete an element from the list
        list.deleteNode(30);
        System.out.println("After deleting 30:");
        list.displayList();
    }
}
