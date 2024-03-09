//package main.java.Week1.Stack;
//// 225  Implement Stack using Queues
//
//import java.util.ArrayList;
//
//class MyStack {
//    private ArrayList<Integer> queue;
//
//    public MyStack() {
//        queue = new ArrayList<>();
//    }
//
//    public void push(int x) {
//        queue.add(x);
//    }
//
//    public int pop() {
//        return queue.remove(queue.size() - 1);
//    }
//
//    public int top() {
//        return queue.get(queue.size() - 1);
//    }
//
//    public boolean empty() {
//        if (queue.isEmpty()) {
//            return true;
//        }
//        return false;
//    }
//}
//
///**
// * Your MyStack object will be instantiated and called as such:
// * MyStack obj = new MyStack();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.top();
// * boolean param_4 = obj.empty();
// */
//
//
//public class StackQueue {
//    public static void main(String[] args) {
//        MyStack obj = new MyStack();
//        obj.push(1);
//        int param_2 = obj.pop(); //
//        int param_3 = obj.top(); //
//        boolean param_4 = obj.empty(); //
//        System.out.println(param_2);
//        System.out.println(param_3);
//        System.out.println(param_4);
//    }
//}
