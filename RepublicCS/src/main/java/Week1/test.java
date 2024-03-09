package main.java.Week1;

import java.util.Stack;

public class test {
    public static void main(String[] args) {
        // 1. Initialize a stack
        Stack<Integer> s = new Stack<>();

        // 2. Push new element
        s.push(5);
        s.push(13);
        s.push(8);
        s.push(6);

        // 3. check if stack is empty
        if (s.empty() == true) {
            System.out.println("Stack is empty!");
        }
        s.pop();
        System.out.println("The top element is: " + s.peek());
        System.out.println("Size is " + s.size());
    }
}
