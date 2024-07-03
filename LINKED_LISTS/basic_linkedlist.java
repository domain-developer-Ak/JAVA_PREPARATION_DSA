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

    public void append(Node newNode){
        Node current = this.head;
        if(current == null){
            this.head = newNode;
        }
        else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insert(Node newNode, int index){
        Node current = this.head;
        if(index == 0){
            newNode.next = current;
            this.head = newNode;
        }
        else{
            for(int i = 0 ; i < index - 1 && current!=null ; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int delete(int index){
        Node current = this.head;
        Node previous = null;
        int deletedValue = -1;
        if(index == 0){
            deletedValue = this.head.data;
            this.head = this.head.next;
        }
        else{
            for(int i = 0 ; i < index - 1 && current !=null ; i++){
                previous = current;
                current = current.next;
            }
            if(current != null){
                deletedValue = current.data;
                previous.next = current.next;
            }
        }
        return deletedValue;
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
    l1.append(newNode1);
    l1.insert(newNode2, 2);
    l1.delete(2);
    l1.displayLinkedList();
}
}
