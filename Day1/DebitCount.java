import java.util.Scanner;

public class DebitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number of transactions
        System.out.print("Enter the number of transactions: ");
        int n = scanner.nextInt();

        int[] transactions = new int[n];

        // Taking input for transactions
        System.out.println("Enter the transaction amounts:");
        for (int i = 0; i < n; i++) {
            transactions[i] = scanner.nextInt();
        }

        // Counting debits (when current transaction > next transaction)
        int debitCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (transactions[i] > transactions[i + 1]) {
                debitCount++;
            }
        }

        // Printing the number of debits
        System.out.println("Number of debit transactions: " + debitCount);

        scanner.close();
    }
}

    

