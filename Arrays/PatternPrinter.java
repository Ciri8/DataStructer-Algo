import java.util.Scanner;

public class PatternPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the pattern: ");
        int n = scanner.nextInt(); // Read the input number from the user

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("# ");
                } else if (j == i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close(); // Close the scanner
    }
}
