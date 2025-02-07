import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of rows
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }

        scanner.close();
    }
}
