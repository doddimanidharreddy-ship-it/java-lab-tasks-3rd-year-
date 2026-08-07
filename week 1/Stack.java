// Java Program to Implement Stack Data Structure
// Using Array - LIFO (Last In First Out) principle
public class Stack {

    // Array to store stack elements
    int[] stackArr;

    // Variable to track the top index of stack
    int top;

    // Maximum capacity of the stack
    int capacity;

    // Constructor to initialize stack with given size
    Stack(int size)
    {
        stackArr = new int[size];
        capacity = size;
        top = -1; // top = -1 means stack is empty
    }

    // Method to push (insert) element onto top of stack
    void push(int element)
    {
        // Check if stack has reached its maximum capacity
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
            return;
        }

        // Increment top pointer and add element at top
        top++;
        stackArr[top] = element;
        System.out.println(element + " pushed to stack");
    }

    // Method to pop (remove) element from top of stack
    int pop()
    {
        // Check if stack is empty before popping
        if (top == -1) {
            System.out.println("Stack Underflow! Stack is empty");
            return -1;
        }

        // Return element at top and decrement top pointer
        return stackArr[top--];
    }

    // Method to peek top element without removing it
    int peek()
    {
        // Check if stack is empty
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        // Return element at top without changing top pointer
        return stackArr[top];
    }

    // Method to check whether stack is empty
    boolean isEmpty()
    {
        return top == -1;
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Create stack with capacity of 5 elements
        Stack stack = new Stack(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display the current top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println(stack.pop() + " popped from stack");
        System.out.println(stack.pop() + " popped from stack");

        // Display top element after pops
        System.out.println("Top element after pops: " + stack.peek());
    }
}
