package Recursion;
//Factorial problem using recursion
public class Recursion {
    public int factorial(int n){
        if (n < 0){
            return -1;
        }
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }


    public int fibonacci(int n){
        if(n < 0){
            return -1;
        }
        if (n == 0 || n == 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
