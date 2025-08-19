package java2;

public class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public Stack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }

    // Push element onto stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    // Main method to test stack
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Output: Stack: 10 20 30

        System.out.println("Top element: " + stack.peek()); // Output: 30

        stack.pop();
        stack.display(); // Output: Stack: 10 20

        stack.pop();
        stack.pop();
        stack.pop(); // Underflow
    }
}

