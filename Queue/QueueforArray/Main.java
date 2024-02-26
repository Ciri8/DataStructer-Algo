package Queue.QueueforArray;

public class Main {
   public static void main(String[] args) {
    QueueArray qarr = new QueueArray(3);
    qarr.Enqueue(1);
    qarr.Enqueue(2);
    qarr.Enqueue(3);    
    qarr.Enqueue(4);
    boolean result = qarr.isEmpty();
    System.out.print(result);
   }
}
