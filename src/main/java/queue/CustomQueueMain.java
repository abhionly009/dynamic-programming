package main.java.queue;

public class CustomQueueMain {

    public static void main(String[] args) {

        CustomQueues customQueues = new CustomQueues(3);

        customQueues.offer(10);
        customQueues.offer(20);
        customQueues.offer(30);

        customQueues.print();
        System.out.println();
        System.out.println(customQueues.isEmpty());

        System.out.println(customQueues.peek());

        System.out.println(customQueues.poll());

        customQueues.print();

        System.out.println(customQueues.size());

    }
}
