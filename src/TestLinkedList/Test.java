package TestLinkedList;



class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Test{
    Node head;
    void insertAtBeginning(int data) {
        Node newnode = new Node(data);

        newnode.next = head;
        head = newnode;



    }

    void display()
    {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ "-> ");
            temp = temp.next;
//            insertAtBeginning(temp.data);
        }
        System.out.print("null");
    }

    public static void main(String[] args)
    {
        Test list = new Test();
        list.insertAtBeginning(50);
        list.insertAtBeginning(40);
        list.insertAtBeginning(30);

        list.display();
    }



}