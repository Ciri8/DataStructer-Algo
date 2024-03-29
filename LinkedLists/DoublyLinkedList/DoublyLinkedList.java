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
      System.out.println();
   }
  }
   //reverse traversal
  public void reversetraversal(){
   if (head == null){
      System.out.print("Nothing in the last node!");
   }else{
      Node tempNode = tail;
      for (int i = 0; i < size; i++){
         System.out.print(tempNode.val);
         if (tempNode.prev != null){
            System.out.print(" <== ");
         }
         tempNode = tempNode.prev;
      }
      System.out.println();
   }
  }


  boolean search(int val){
   if (head == null){
      System.out.print("Nothing here!");
      return false;
   }else{
      Node tempNode = head;
      for (int i = 0; i < size; i++){
         if (tempNode.val == val){
            System.out.print("Value found at: " + i);
            return true;
         }
         tempNode = tempNode.next;
      }
      System.out.println();
   } return false;
  }

  public void deletion(int location){
   if (head == null){
      System.out.print("Your good nothing to delete!");
      return;
   }else if (location == 0){
      if(size == 1){
         head = null;
         tail = null;
         size--;
         return;
      }else{
         head = head.next;
         head.prev = null;
      }
   }else if (location >= size - 1) { // Deleting the last node or out-of-bounds treated as last
      if (size == 1) { // If there's only one node
          head = tail = null;
      } else {
          tail = tail.prev;
          tail.next = null;
      }
      }else{
      Node tempNode = head;
      for (int i = 0; i < location - 1; i++){
         tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      tempNode.next.prev = tempNode;
   }
   size--;
}


}


