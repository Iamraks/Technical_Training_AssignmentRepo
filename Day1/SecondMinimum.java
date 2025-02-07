import java.util.Scanner;

public class SecondMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = new int[10];

        // Taking input from user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize min1 (smallest) and min2 (second smallest) with large values
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Loop through array to find min1 and min2
        for (int num : arr) {
            if (num < min1) {  // New smallest found
                min2 = min1;
                min1 = num;
            } else if (num > min1 && num < min2) { // Update second smallest
                min2 = num;
            }
        }

        // Check if second minimum exists
        if (min2 == Integer.MAX_VALUE) {
            System.out.println("No second minimum found (all elements may be same).");
        } else {
            System.out.println("The second minimum number is: " + min2);
        }

        scanner.close();
    }
}

    

