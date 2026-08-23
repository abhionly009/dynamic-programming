package main.java.queue;

public class CircularQueue {


        private int[] arr;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        CircularQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];

            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(int value) {

            if (size == capacity) {
                System.out.println("Queue is full");
                return;
            }

            // Move rear circularly
            rear = (rear + 1) % capacity;

            arr[rear] = value;
            size++;
        }

        public int dequeue() {

            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int value = arr[front];

            // Move front circularly
            front = (front + 1) % capacity;

            size--;

            return value;
        }

        public int peek() {

            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == capacity;
        }

        public int size() {
            return size;
        }

}
