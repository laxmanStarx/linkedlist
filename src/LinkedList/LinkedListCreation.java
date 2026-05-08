package LinkedList;

import java.util.LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCreation {
    Node head;

    void insertAtBeginning(int data){
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;

        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+ "-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        LinkedListCreation list = new LinkedListCreation();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();

    }


}
