package Stack.StackUsingLinkedList;

import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> linkedList;

    public Stack() {
        linkedList = new LinkedList<>();
    }

    // Push method
    public void push(int value) {
        linkedList.addFirst(value);
        System.out.println("Inserted " + value + " in Stack");
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
            return -1; // Consider throwing an exception here
        } else {
            return linkedList.removeFirst();
        }
    }

    // Peek Method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
            return -1; // Consider throwing an exception here
        } else {
            return linkedList.peekFirst();
        }
    }

    // Delete stack
    public void deleteStack() {
        linkedList.clear();
        System.out.println("The Stack is deleted");
    }
}
