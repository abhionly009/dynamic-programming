package main.java.linkedList;

public class LinkedListCreation {

    private Node head;


    public void insert(int value) {
        Node newNode = new Node(value);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse till last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Attach new node
        current.next = newNode;
    }

    public void insertAtBeginning(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }




}
