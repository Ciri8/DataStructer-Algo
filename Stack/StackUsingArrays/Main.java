package Stack.StackUsingArrays;

public class Main{
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        boolean result = stack.isFull();
        System.out.println(result);
        stack.push(20);
    }
}