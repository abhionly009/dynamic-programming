package main.java.linkedList;

public class LinkedListDemoMain {

    public static void main(String[] args) {

        LinkedListCreation linkedListCreation = new LinkedListCreation();

        linkedListCreation.insert(10);
        linkedListCreation.insert(20);
        linkedListCreation.insert(30);
        linkedListCreation.insert(50);
        linkedListCreation.insert(90);

        linkedListCreation.display();


        linkedListCreation.insertAtBeginning(5);
        linkedListCreation.display();


        linkedListCreation.insertAtEnd(100);
        linkedListCreation.display();


        linkedListCreation.deleteFirstElement();

        linkedListCreation.display();

        linkedListCreation.deleteLastElement();
        linkedListCreation.display();

        linkedListCreation.reverse();
        linkedListCreation.display();

        boolean isUpdated = linkedListCreation.update(310,400);
        System.out.println(isUpdated);
        linkedListCreation.display();

    boolean result = linkedListCreation.searchElement(30);

        if (result) {
            System.out.println("found");
        }else{
            System.out.println("No such element found");
        }


    }
}
