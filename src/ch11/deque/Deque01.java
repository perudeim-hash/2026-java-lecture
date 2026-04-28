package ch11.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque01 {
    public static void main(String[] args) {
        Deque<Integer> dequeStack = new ArrayDeque<>();
        // 앞으로 밀어 넣기
        dequeStack.push(1);
        dequeStack.push(2);
        dequeStack.push(3);
        System.out.println(dequeStack);
        System.out.println(dequeStack.peek());
        System.out.println("dequeStack.pop = " + dequeStack.pop());
        System.out.println("=====================================");
        System.out.println(dequeStack);

        System.out.println(dequeStack.peek());
        System.out.println("dequeStack.pop = " + dequeStack.pop());
        System.out.println("=====================================");

        System.out.println(dequeStack);
        System.out.println(dequeStack.peek());
        System.out.println("dequeStack.pop = " + dequeStack.pop());
        System.out.println("=====================================");

        Deque<Integer> dequeQueue = new ArrayDeque<>();

        dequeQueue.offer(10);
        dequeQueue.offer(20);
        dequeQueue.offer(30);
        System.out.println(dequeQueue);
        System.out.println("dequeQueue.peek = " + dequeQueue.peek());
        System.out.println("dequeQueue.poll() = " + dequeQueue.poll());
        System.out.println("dequeQueue.poll() = " + dequeQueue.poll());
        System.out.println("dequeQueue.poll() = " + dequeQueue.poll());


    }
}
