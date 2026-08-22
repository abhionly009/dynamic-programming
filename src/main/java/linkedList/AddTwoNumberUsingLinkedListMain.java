package main.java.linkedList;

public class AddTwoNumberUsingLinkedListMain {

    public static void main(String[] args) {

        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        AddTwoNumberInLinkedList demo = new AddTwoNumberInLinkedList();

       Node result = demo.addList(l1,l2);

       LinkedListCreation.traverse(result);
    }
}
