package CircularSinglyLinkedList.csl;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList csll = new CircularLinkedList();
        // csll.csl(10);
        csll.insert(10, 0);
        csll.insert(20, 1);
        System.out.println(csll.head.next.val);
        csll.traverse();
    }
}
