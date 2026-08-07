// Problem Statement: Write a Java program to implement a basic Stack data structure.
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack Overflow!");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack Underflow!");
            return -1;
        }
    }

    public int peek() {
        return (top >= 0) ? stackArray[top] : -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
    }
}
/*
OUTPUT:
Pushed: 10
Pushed: 20
Pushed: 30
Top element (peek): 30
Popped element: 30
Top element after pop: 20
*/
