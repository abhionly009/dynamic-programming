package main.java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {

    public static void generateBinary(int n) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("1");

        for (int i = 1; i <= n; i++) {

            String current = queue.poll();

            System.out.print(current + " ");

            queue.offer(current + "0");
            queue.offer(current + "1");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        generateBinary(5);

    }
}
