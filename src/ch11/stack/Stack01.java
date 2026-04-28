package ch11.stack;

import java.util.Stack;

public class Stack01 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        System.out.println(stack);
        System.out.println("다음 나올거 : " + stack.peek());
        System.out.println("stack.pop = " + stack.pop());
        System.out.println("==============================");
        System.out.println(stack);
        System.out.println("다음 나올거 : " + stack.peek());
        System.out.println("stack.pop = " + stack.pop());



    }
}
