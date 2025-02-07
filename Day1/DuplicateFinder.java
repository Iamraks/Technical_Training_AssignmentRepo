import java.util.Scanner;

public class DuplicateFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        // Taking input from user - exactly 10 numbers
        System.out.println("Enter exactly 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        // Finding the first duplicate
        int firstDuplicate = -1; // -1 means no duplicate found initially

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) { // Checking ahead in the array
                if (arr[i] == arr[j]) {
                    firstDuplicate = arr[i];
                    break; // Exit inner loop when duplicate is found
                }
            }
            if (firstDuplicate != -1) {
                break; // Exit outer loop as well
            }
        }

        // Print the result
        if (firstDuplicate != -1) {
            System.out.println("First duplicate number is: " + firstDuplicate);
        } else {
            System.out.println("No duplicate found.");
        }

        scanner.close();
    }
}
