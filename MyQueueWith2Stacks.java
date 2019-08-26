/**
 * A MyQueue class which implements a queue using two stacks.
 */

package main;

import java.util.Stack;

public class MyQueueWith2Stacks {

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.enqueue(1).enqueue(2).enqueue(3);
        System.out.println(myQueue);

        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println(myQueue);

        myQueue.enqueue(4).enqueue(5).enqueue(6);
        System.out.println(myQueue);

        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println(myQueue);
        System.out.println("Dequeue: " + myQueue.dequeue());
        System.out.println(myQueue);
    }

    private static class MyQueue<E> {
        Stack<E> stack1, stack2;

        MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public MyQueue enqueue(E e) {
            stack1.push(e);
            return this;
        }

        public E dequeue() {
            if (!stack2.isEmpty()) {
                return stack2.pop();
            } else {
                while(!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }
        }

        public String toString() {
            return String.format("Stack1: %s, Stack2: %s", stack1.toString(), stack2.toString());
        }
    }
}
