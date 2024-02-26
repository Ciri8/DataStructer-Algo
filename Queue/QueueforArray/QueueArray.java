package Queue.QueueforArray;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("Queue succecfully created with size of: " + size);
    }


    public boolean isFull(){
        if (topOfQueue == arr.length - 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        return beginningOfQueue == -1;//check if first cell is empty since its queue FIFO.
}

public void Enqueue(int val){
    if (isFull()){
        System.out.println("The Queue is full!");
    }else{
        if (isEmpty()){
            beginningOfQueue = 0;
        }
        topOfQueue++;
        arr[topOfQueue] = val;
        System.out.println("Succecfully inserted " + val + " in the queue");
    }
}

public int dequeue(){
    if (isEmpty()){
        System.out.println("Queue is empty! ");
        return -1;
    }else{
        int result = arr[beginningOfQueue];
        beginningOfQueue++;
        if (beginningOfQueue > topOfQueue){
            topOfQueue = -1;
            beginningOfQueue = -1;
        }
        return result;
    }
}

public int peek(){
    if (!isEmpty()){
        return arr[beginningOfQueue];
    }else{
        System.out.println("Queue is empty! ");
        return -1; 
    }
}
}
