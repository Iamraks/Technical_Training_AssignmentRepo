import java.util.Scanner;

public class HighestDuplicateCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for the array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt(); // User inputs the size

        int[] arr = new int[n];

        // Taking input from user based on the size entered
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxCount = 0; // Stores the highest duplicate count

        // Checking each number and counting its occurrences
        for (int i = 0; i < n; i++) {
            int count = 1; // Start counting from 1 (itself)
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // Update maxCount if the current number's count is greater
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // Printing the highest duplicate count
        System.out.println("Highest duplicate count: " + maxCount);

        scanner.close();
    }
}
