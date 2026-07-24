package main.java.queue;

import java.util.Arrays;

public class CustomQueues<T> {

   private Object [] arr ;
    private int front;
    private int rear;
    private int capacity;
   private int size;


    public CustomQueues( int capacity) {
        this.capacity = capacity;
        this.arr = new Object[capacity];
        this.front =0;
        this.rear = 0;
        this.size = 0;

    }

    public void offer(T data){

        if (size == capacity){
            throw new RuntimeException("Queue is already full");
        }

        arr[rear] = data;
        rear = (rear + 1) % capacity;
        size++;

    }

    @SuppressWarnings("unchecked")
    public T peek(){

        if (size ==0){
            throw new RuntimeException("No element Queue is empty");
        }
        return (T) arr[front];
    }

    @SuppressWarnings("unchecked")
    public T poll(){
        if (size ==0){
            throw new RuntimeException("No element Queue is empty");
        }

       T value =  (T) arr[front] ;
        arr[front] = 0;
        front++;
        size--;
        return value;
    }


    public boolean isEmpty(){
        return size ==0;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
