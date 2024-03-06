package BinaryTrees;

public class BinaryNode {
    public String value;
    public BinaryNode left;
    public BinaryNode right;
    public int height;

    public BinaryNode(String value){
        this.value = value;
        this.left = null;
        this.right = null;
        this.height = 0;
    }
    public BinaryNode(){
        this.value = null;
        this.left = null;
        this.right = null;
        this.height = 0;
    }
}
