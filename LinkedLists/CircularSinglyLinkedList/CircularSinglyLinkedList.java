package LinkedLists.CircularSinglyLinkedList;


public class CircularSinglyLinkedList{
    public Node head; 
    public Node tail;
    public int size;

    public CircularSinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    

    public Node csl(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        newNode.next = head;
        size = 1;
        return head;
    }

    public void insert(int val, int location){
        Node node = new Node(val);
        node.val = val;
        if (head == null){
            csl(val);
            return;
        }else if (location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        }else if (location >= size ){
            node.next = head;//before in a Single linked list the pointer for the next node was null but now its the head so it circles back to it.
            tail.next = node;//tails pointer should point to current node
            tail = node;
        }else{
            Node tempnode = head;//same logic as SLL.
            int index = 0;
            while (index < location - 1){
                tempnode = tempnode.next;
                index++;
            }
            node.next = tempnode.next;
            tempnode.next = node;
        }
        size++;
    }


    //same logic as SLL, but you cant use while loop because it would infinit loop - T: O(N) S: O(1)
    public void traverse(){
        if (head != null){
            Node curr = head;
            for (int i = 0; i < size; i++){
                System.out.print(curr.val);
                if (curr.next != null){
                    System.out.print(" --> ");
                }
                curr = curr.next;
            }
        }
    }
    //once again do not use while loop as it would cause infinit loop, T: O(n) S: O(1)
    boolean search(int val){
        if ( head != null){
            Node curr = head;
            for (int i = 0; i < size; i++){
                if (curr.val == val){
                    System.out.print("Found value at: " + i);
                    return true;
                }
                curr = curr.next;//go to next node
            }
        }return false;
    }


}