public class UniqueDigitsFinderRecursive {

    // Recursive function to extract digits from a number
    public static void extractDigits(int num, boolean[] digitPresent) {
        if (num == 0) return; // Base case: stop when num becomes 0
        digitPresent[num % 10] = true; // Mark the last digit as present
        extractDigits(num / 10, digitPresent); // Recursive call for the remaining digits
    }

    // Recursive function to process the array
    public static void processArray(int[] numbers, int index, boolean[] digitPresent) {
        if (index == numbers.length) return; // Base case: stop when all numbers are processed
        extractDigits(numbers[index], digitPresent); // Extract digits from current number
        processArray(numbers, index + 1, digitPresent); // Recursive call for the next number
    }

    // Function to find unique digits using recursion
    public static void findUniqueDigits(int[] numbers) {
        boolean[] digitPresent = new boolean[10]; // To track digits 0-9
        processArray(numbers, 0, digitPresent); // Start processing the array recursively
        
        // Print unique digits
        System.out.print("[");
        boolean first = true;
        for (int i = 0; i < 10; i++) {
            if (digitPresent[i]) {
                if (!first) System.out.print(", ");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] numbers = {111, 222, 333, 4444, 666};
        findUniqueDigits(numbers);
    }
}
    
