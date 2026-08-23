package main.java.queue;

public class QueueStackMain {

    public static void main(String[] args) {

        QueueImplementationUsingStack queue = new QueueImplementationUsingStack();

        queue.enqueue(12);
        queue.enqueue(90);
        queue.enqueue(14);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.stack2);
        System.out.println(queue.isEmpty());
    }
}
