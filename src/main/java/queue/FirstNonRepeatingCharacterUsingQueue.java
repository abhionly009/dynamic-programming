package main.java.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingCharacterUsingQueue {

    public static void main(String[] args) {

        firstNonRepeating("aabc");

    }

    public static void firstNonRepeating(String stream) {

        Map<Character, Integer> frequency = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : stream.toCharArray()) {

            // Increase frequency
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);

            // Add character to queue
            queue.offer(ch);

            // Remove repeating characters from front
            while (!queue.isEmpty()
                    && frequency.get(queue.peek()) > 1) {

                queue.poll();
            }

            // First non-repeating character
            if (queue.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
    }
}
