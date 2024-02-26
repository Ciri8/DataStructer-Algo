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



     public void insert(int val,int location){
      Node node = new Node(val);
      if (head == null){
         createSingleDLL(val);
         return;
      }else if (location == 0){
         node.next = head;
         node.prev = null;
         head.prev = node;//heads previous pointer is set to the node
         head = node;//head becomes ndoe
      }else if (location >= size){
         node.next = null;//set to null because there is nothing after tail
         node.prev = tail;//links nodes previous node to the tail
         tail.next = node;//tails pointer becomes the node
         tail = node;//tail becomes node
      }else{
         Node tempNode = head;
         int index = 0;
         while (index < location - 1){//loop to find the location of node before it to insert
            tempNode = tempNode.next;
            index++;
         }
         node.prev = tempNode;//linking previous node with current new node we made
         node.next = tempNode.next;//linking next node to the new node we made
         tempNode.next = node;//new nodes refrences now becomes the node
         node.next.prev = node;//this links the current nodes next node with the node before it making it the node link.
         
      }
      size++;
  }
//normal traversal
  public void traverse(){
   if (head == null){
      System.out.print("No DLL here!");
   }else{
      Node tempNode = head;
      for (int i = 0; i < size; i++){
         System.out.print(tempNode.val);
         if (tempNode.next != null){
            System.out.print(" ==> ");
         }
         tempNode = tempNode.next;
      }
   }
  }



}


