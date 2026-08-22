package main.java.linkedList;

public class LinkedListCreation {

    private Node head;


    public Node insert(int value) {
        Node newNode = new Node(value);

        // If list is empty
        if (head == null) {
            head = newNode;
            return null;
        }

        // Traverse till last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Attach new node
        current.next = newNode;

        return current;
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

    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;

        while(current.next != null)
        {
            current = current.next;
        }

        current.next = newNode;
    }


    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void traverse(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }


    public void deleteFirstElement(){

        if (head == null){
            System.out.println("There is no element to delete, List is empty");
            return;
        }

        Node current = head;

        head = current.next;

    }


    public void deleteLastElement(){

        if (head == null){
            System.out.println("There is no element to delete, List is empty");
            return;
        }

        if (head.next ==null){
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next !=null){
            current =current.next;
        }

        current.next = null;
    }


    // head last element should be head and head should be last and it's next should point to null
    public void reverse(){

        if (head == null){
            System.out.println("List is empty");
            return;
        }

        if (head.next == null){
            System.out.println("Single element there must be at least 2 element to reverse");
            return;
        }

        Node previous = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;  // Save next node

            current.next = previous;  // Reverse the link

            previous = current;       // Move previous forward
            current = next;           // Move current forward
        }

        head = previous;

    }


    public boolean searchElement(int value){
        boolean result = false;

        if (head == null){
            return result;
        }
        Node current = head;

        while (current.next!=null){

            if (current.value == value){
                return true;
            }else {
                current = current.next;
            }

        }
        return result;
    }


    public boolean update(int oldValue, int newValue){
        boolean result = false;

        if (head == null){
            return result;
        }

        Node current = head;

        while (current.next != null){

            if (current.value == oldValue){
                current.value = newValue;
                result = true;
            }
                current = current.next;

        }
        return result;
    }

}
