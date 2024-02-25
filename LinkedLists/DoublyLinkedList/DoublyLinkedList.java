package LinkedLists.DoublyLinkedList;

public class DoublyLinkedList{
     public Node head;
     public Node tail;
     public int size;

     public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
     }

     public Node createSingleDLL(int val){
        Node node = new Node(val);
        head = node;
        tail = node;
        size = 1;
        return head;
     }


}