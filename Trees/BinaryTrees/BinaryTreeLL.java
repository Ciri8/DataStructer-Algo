package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeLL {
    BinaryNode root;


    public BinaryTreeLL(){
        this.root = null;
    }

    //preOrder Traversal (DFS)
    //using recursion
    //root -> left -> right
    void preOrder(BinaryNode node){
        if (node == null){//base case which visits all nodes until there are no nodes which identifies last nodes
            return;
        }
        System.out.print(node.value + " ");//print out values of the nodes
        preOrder(node.left);//visit the lefts nodes
        preOrder(node.right);//visit the right nodes
    }
    //left -> root -> right
    void inOrder(BinaryNode node){
        if (node == null){//if there are no children for the node then return
            return;
        }
        inOrder(node.left);//first thing you want to do is find left most value so you do that by calling the the function and starting from left most node
        System.out.print(node.value + " ");//then we want to visit the root node and you do that by printing out the node.value of the child
        inOrder(node.right);//then we visit the right node

    }
    //left -> right -> root
    void postOrder(BinaryNode node){
        if (node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");//then we want to visit the root node and you do that by printing out the node.value of the child

    }

    //level order
    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();//create a queue using linked list of Binary node
        queue.add(root);//add root to the first queue
        while (!queue.isEmpty()){//while queue is not empty enter loop
            BinaryNode current = queue.remove();//set Binary node current to call queue.remove method
            System.out.print(current.value + " ");//print out first node value
            if (current.left != null){//if the node has anychildren (if current.left is not null) then add them to queue
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
        }
    }
}
