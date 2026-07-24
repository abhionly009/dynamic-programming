package main.java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();


        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        for (Integer num:queue){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println(queue.element());

        System.out.println(queue.poll());

        System.out.println(queue.peek());

        System.out.println(queue.remove());

        System.out.println(queue.element());

        System.out.println(queue.size());

        for (Integer num : queue){
            System.out.print(num +" ");
        }
    }
}
