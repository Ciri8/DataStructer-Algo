public class main {
    //creating a singly linked list takes 0(1) time and space comp.
    public static void main(String[] args) {
        SingleLinkedLists sll = new SingleLinkedLists();
        // sll.createSinglyLinkedList(5);
        // System.out.println(sll.head.value);
        sll.insert(6, 1);
        sll.insert(7, 2);
        sll.insert(8, 3);
        sll.insert(9, 4);
        sll.traverse();
        sll.search(7);

        // System.out.println(sll.head.next.next.value);
    }
}
