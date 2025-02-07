import java.util.Scanner;

public class HighestSalesDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for number of days
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        
        int[] sales = new int[n];

        // Taking input for sales data
        System.out.println("Enter the sales for each day:");
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            sales[i] = scanner.nextInt();
        }

        // Finding the day with highest sales
        int maxSales = sales[0];
        int day = 1;

        for (int i = 1; i < n; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                day = i + 1;
            }
        }

        // Printing the result
        System.out.println("The day with the highest sales is: Day " + day + " with sales of " + maxSales);
        
        scanner.close();
    }
}
