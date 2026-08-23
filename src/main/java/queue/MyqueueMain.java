package main.java.queue;

public class MyqueueMain {

    public static void main(String[] args) {

        MyQueueUsingArray myQueueUsingArray = new MyQueueUsingArray(3);

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
