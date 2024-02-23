package CircularSinglyLinkedList;

public class CircularSinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public CircularSinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node createcsl(int value){
        Node node = new Node(value);
        head = node;
        tail = node;
        size = 1;
        
    }

    
}