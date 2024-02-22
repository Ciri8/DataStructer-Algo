public class SingleLinkedLists {
    public Node head;//head points to first node of the list
    public Node tail;//tail points to last node of list
    public int size;//size holds the number of nodes in the list

    public SingleLinkedLists() {//constrocor
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //method to create a singly linked list with a single node
    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node(nodeValue);//creates a new node with given value
        head = node;//since this is the first node it becomes the head of the list
        tail = node;//this is the last node of the list so it becomes the tail
        size = 1;//current size of the linked list
        return head;//returns the head of the list
    }

    //Insert method Singly linked list
    public void insert(int value, int location){//to insert you need a value and a location of the node
        Node node = new Node(value);//create new node
        if (head == null){//if the head is empty 
            createSinglyLinkedList(value);//creates a new node based on the method we made
            return;
        }else if(location == 0){//if location is at the first index
            node.next = head;//your pointer (next) becomes the new head
            head = node;//your head now becomes the current node
        }else if(location >= size ){//if the location is bigger than the size we first initialized the linked list to be then:
            node.next = null;//we set the pointer to null because its the last node in the size
            tail.next = node;//your setting the last nodes refrence to the current node which is the last node. so your saying tails pointer becomes node
            tail = node;//tail becomes the node
        } else {//here we going to loop through the linked list to find the specified location and insert the node at that location
           
           //this part of the code is responsible for inserting a node wherever in the linked list except beginning and end.
            Node tempNode = head;//initizales a temp node to start at head of list (this will be used to traverse the list.)
            int index = 0;//index to start at 0 index of the linkedlist, keeps track of current position as we traverse
            while (index < location - 1){//this loop will continue until temp node is found and we will insert right before it is found hence the - 1.
                tempNode = tempNode.next; //we set the temp node to point to the next node
                index++;//this will increase the index by 1 to go to next node until we find specified location
            }//so  now that while loop find the node that is refrenced we now have to actually add the new node.
            node.next = tempNode.next; // sets the old pointer to the new pointer that we want to insert node from.
            tempNode.next = node;//tempNode.next is now the pointer
        }
        size++;//increases the size of the linked list as we add.

    }

    //Single linked traversal method
    public void traverse(){
        Node tempNode = head;//we make a new node starting at the head in order to traverse
        if (head == null){//if head (first node) is empty
            System.out.print("Nothing here!");//print it out to console
        }else{
            for (int i = 0; i < size; i++){//start of loop that traverses all nodes and prints out the values
                System.out.print(tempNode.value);
                if (tempNode.next != null){//if the next node is not null then print out --> and repeats loop
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;//sets the temp node to the pointer
            }
        }
    }


    boolean search(int value){
        if (head != null){//if the head is not null then proceed
            Node tempNode = head;//create tempNode starting from head
            for (int i = 0; i < size; i++){//looping through the linkedlist
                if (tempNode.value == value){//if the tempnodes value is equal to the value
                    System.out.print(" \nFound Node at: " + i + "\n");//printing out the index at where its found
                    return true;
                }
                tempNode = tempNode.next;//go to next node.
            }
        }
        System.out.print("Node not found");
        return false;
    }


}
