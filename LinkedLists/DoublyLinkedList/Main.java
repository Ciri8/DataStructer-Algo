package LinkedLists.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        // dll.createSingleDLL(10);
        // System.out.println(dll.head.val);
        dll.insert(10, 0);
        dll.insert(20, 1);
        dll.insert(30, 2);
        dll.insert(40, 3);
        dll.traverse();


    }


}
