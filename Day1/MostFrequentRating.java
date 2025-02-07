import java.util.Scanner;

public class MostFrequentRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of ratings
        System.out.print("Enter the number of ratings: ");
        int n = scanner.nextInt();

        int[] ratings = new int[n];

        // Taking input for product ratings
        System.out.println("Enter the ratings (1-5):");
        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
        }

        // Frequency array to count occurrences of ratings (1-5)
        int[] frequency = new int[6]; // Index 0 is unused

        for (int rating : ratings) {
            frequency[rating]++; // Increment count for that rating
        }

        // Finding the most frequent rating
        int mostFrequent = 1;
        int maxCount = frequency[1];

        for (int i = 2; i <= 5; i++) { // Checking ratings from 2 to 5
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequent = i;
            }
        }

        // Print the result
        System.out.println("The most frequent rating is: " + mostFrequent + " (appeared " + maxCount + " times)");

        scanner.close();
    }
}

    

