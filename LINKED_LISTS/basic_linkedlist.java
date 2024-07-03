package LINKED_LISTS;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    LinkedList(){
        this.head = null;
    }
    public void createLinkedList(){
        Node node1 = new Node(11);
        this.head = node1;

        Node node2 = new Node(8);
        node1.next = node2;
        
        Node node3 = new Node(17);
        node2.next = node3;
    }

    public void displayLinkedList(){
        Node current = this.head;
        while (current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        while(current == null){
            System.out.print("NULL");
            break;
        }
    }
}

public class basic_linkedlist {
    public static void main(String[] args){
    LinkedList l1 = new LinkedList();
    Node newNode1 = new Node(5);
    Node newNode2 = new Node(11);
    Node newNode3 = new Node(15);
    l1.createLinkedList();
    l1.displayLinkedList();
}
}
