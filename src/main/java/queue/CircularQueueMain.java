package main.java.queue;

public class CircularQueueMain {

    public static void main(String[] args) {

        CircularQueue myQueueUsingArray = new CircularQueue(3);
        System.out.println(myQueueUsingArray.dequeue());
        myQueueUsingArray.enqueue(12);
        myQueueUsingArray.enqueue(90);
        myQueueUsingArray.enqueue(34);
        myQueueUsingArray.enqueue(80);

        System.out.println(myQueueUsingArray.dequeue());
        System.out.println(myQueueUsingArray.peek());
        System.out.println(myQueueUsingArray.size());

    }
}
