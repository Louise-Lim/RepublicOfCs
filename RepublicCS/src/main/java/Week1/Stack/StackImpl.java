package main.java.Week1.Stack;
// E 495. Implement stack

import java.util.ArrayList;

public class StackImpl {
    ArrayList<Integer> data = new ArrayList<>();

    /*
     * @param x: An integer
     * @return: nothing
     */
    public void push(int x) {
       data.add(x);
    }

    /*
     * @return: nothing
     */
    public void pop() {
        data.remove(data.size() - 1);
    }

    /*
     * @return: An integer
     */
    public int top() {
        return data.get(data.size() - 1);
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        if (data.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();

        stack.push(1);
        stack.pop();
        stack.push(2);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.isEmpty());
        stack.push(3);
        System.out.println(stack.isEmpty());
    }
}