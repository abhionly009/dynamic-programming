package main.java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CustomQueueMain {

    public static void main(String[] args) {

        CustomQueues customQueues = new CustomQueues(3);

        customQueues.offer(10);
        customQueues.offer(20);
        customQueues.offer(30);

        System.out.println(customQueues);
        System.out.println(customQueues.isEmpty());

        System.out.println(customQueues.peek());

        System.out.println(customQueues.poll());

        System.out.println(customQueues);

        System.out.println(customQueues.size());

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);
        customQueues.reverseQueue(queue);

        System.out.println(queue);
    }
}
