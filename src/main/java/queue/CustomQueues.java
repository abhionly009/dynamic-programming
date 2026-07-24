package main.java.queue;

public class CustomQueues {

   private int [] arr ;
    private int front;
    private int rear;
    private int capacity;
   private int size;


    public CustomQueues( int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front =0;
        this.rear = 0;
        this.size = 0;

    }

    public void offer(int data){

        if (size == capacity){
            throw new RuntimeException("Queue is already full");
        }

        arr[rear] = data;
        rear++;
        size++;

    }

    public int peek(){

        if (size ==0){
            throw new RuntimeException("No element Queue is empty");
        }
        return arr[front];
    }

    public int poll(){
        if (size ==0){
            throw new RuntimeException("No element Queue is empty");
        }

       int value =  arr[front] ;
        arr[front] = 0;
        front++;
        size--;
        return value;
    }

    public void print(){
        for(int num:arr){
            System.out.print( num +" ");
        }
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public int size(){
        return size;
    }


}
