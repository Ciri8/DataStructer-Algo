package LinkedLists.CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        // csll.csl(10);
        csll.insert(10, 0);
        csll.insert(20, 1);
        System.out.println(csll.head.next.val);
        csll.traverse();
    }
}
