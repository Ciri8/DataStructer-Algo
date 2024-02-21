import java.util.Scanner;
public class BasicPart2 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        //start with sysout saying input numbers
        System.out.println("Enter numbers you want to add: ");

        // Next you need inputs of numbers you want to add
        System.out.println("Enter first number ");
        int num1 = scan.nextInt();

        System.out.println("Enter second number ");
        int num2 = scan.nextInt();

        int add = (num1 + num2);
        System.out.println("Your total is " + add);
    }
}
