package main.java.queue;

import java.util.Stack;

public class QueueImplementationUsingStack {



        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public void enqueue(int value) {
            stack1.push(value);
        }

        public int dequeue() {

            if (stack1.isEmpty() && stack2.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            // Move elements only when stack2 is empty
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }

        public int peek() {

            if (stack1.isEmpty() && stack2.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.peek();
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

}
