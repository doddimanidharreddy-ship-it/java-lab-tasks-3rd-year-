// Problem Statement: Write a Java program to implement a Singly Linked List with insertion and traversal.
public class LinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        System.out.print("Linked List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next == null ? "" : " -> "));
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
    }
}
/*
OUTPUT:
Linked List: 10 -> 20 -> 30 -> 40
*/
