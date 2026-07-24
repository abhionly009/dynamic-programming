package main.java.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(82);
        queue.offer(30);
        queue.offer(15);
        queue.offer(50);

        System.out.println(queue.size());

        System.out.println(queue);

        System.out.println(queue.remove());


        System.out.println(queue);


    }
}
