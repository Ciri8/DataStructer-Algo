import java.util.Scanner; //This line imports the Scanner class from the java.util package, which is used for reading input from various sources, including user input from the console.



public class NumberTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//This line imports the Scanner class from the java.util package, which is used for reading input from various sources, including user input from the console.


        System.out.print("Enter the number for the triangle: "); //This line prints a message to the console without a newline at the end, prompting the user to input a number.


        int n = scanner.nextInt();//This line reads the next integer value that the user enters and assigns it to the variable n.



        for (int i = 1; i <= n; i++) {//This for loop starts with i = 1 and runs as long as i is less than or equal to n, incrementing i by 1 after each iteration. It is used to iterate over each row of the triangle.

            for (int j = 1; j <= i; j++) {//This nested for loop starts with j = 1 and runs as long as j is less than or equal to i, incrementing j by 1 after each iteration. It is used to print numbers in each row, up to the current row number i.

                System.out.print(j + " ");//This line prints the current number j and a space, without a newline at the end. It's used here to print the numbers in a row.

            }
            System.out.println();//After the inner loop ends, this System.out.println() is used to print a newline character, moving the cursor to the next line on the console, so the next row of numbers will start on a new line.


        }


    }
}
