package main.java.queue;

public class MyQueueUsingArray {

    private int [] arr;

    private int front;

    private int rear;

    private int size;

    public MyQueueUsingArray(int capacity) {
       arr = new int[capacity];
        front = 0;
        rear =-1;
        size = 0;
    }


    public void enqueue(int data){
        if (size == arr.length){
            System.out.println("Queue is full");
            return;
        }

        rear++;
        arr[rear] = data;
        size++;

    }


    public int dequeue(){
        if (size ==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = arr[front];
        front++;
        size--;
        return value;

    }


    public int peek(){
        if (size == 0){
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];


    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

}
