package BinaryTrees;

public class BinartyTreeLL {
    BinaryNode root;


    public BinartyTreeLL(){
        this.root = null;
    }

    //preOrder Traversal (DFS)
    //using recursion
    void preOrder(BinaryNode node){
        if (node == null){//base case which visits all nodes until there are no nodes which identifies last nodes
            return;
        }
        System.out.print(node.value + " ");//print out values of the nodes
        preOrder(node.left);//visit the lefts nodes
        preOrder(node.right);//visit the right nodes
    }
}
