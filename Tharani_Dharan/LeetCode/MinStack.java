package Tharani_Dharan.LeetCode;

import java.util.Stack;

//leetcode 155
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minstack;

    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int val) {
        if(minstack.isEmpty() || minstack.peek()>=val){
            minstack.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if(minstack.peek().equals(stack.peek())){
            stack.pop();
            minstack.pop();
        }else{
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(minstack.isEmpty()){
            System.out.println("MinStack is Empty");
            return -1;
        }
        return minstack.peek();
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        System.out.println(obj.getMin());
        obj.push(5);
        obj.push(3);
        obj.push(3);
        obj.push(-1);
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
        obj.push(-7);
        System.out.println(obj.getMin());
    }
}

