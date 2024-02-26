package Stack.StackUsingArrays;

public class Stack {
    int[] arr;
    int top;

public Stack(int size){//specifies the size of the stack
    this.arr = new int[size]; //the array will hold the amount initizilized with size.  (initizlizing the array with a fixed size)
    this.top = -1;//top tracks the index of the top element,  by saying -1 it means that its empty right now
    System.out.println("The size of your stack is: " + size);
}
//checks if top of stack is empty
public boolean isEmpty(){
    if (top == -1){
        return true;
    }else{
        return false;
    }
}

//checks if stack is full
public boolean isFull(){
    if (top == arr.length - 1){//this means when the top most element of the stack is equal to the last elment of the array then return true
        System.out.print("Stack is full");
        return true;
    }else{
        System.out.println("Stack is not full");
        return false;
    }
}
//push method
public void push(int val){
    if (isFull()){
        System.out.print("Your stack cannot add more elements");
    }else{
        arr[top+1] = val;//starting from the top of stack + 1 so it inserts it in the next cell because we started from -1.
        top++;
        System.out.println("Value has been inserted");
    }
}

//pop method
public int pop(){
    if (isEmpty()){
        System.out.print("Stack is empty");
        return -1;
    }else{
        int poppedval = arr[top];//save top index of the array into poppedval variable
        top--;//decrement cuz your deleting an element
        return poppedval;//return value that was poped
    }
}

//peak method
public int peek(){
    if (isEmpty()){
        System.out.println("Your stack is empty");
        return -1;
    }else{
        return arr[top]; 
    }
}



}
