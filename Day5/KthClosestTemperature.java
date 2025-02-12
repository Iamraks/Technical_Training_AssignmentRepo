import java.util.Random;

public class KthClosestTemperature {
    public static int findKthClosest(int[] readings, int target, int k) {
        return quickSelect(readings, 0, readings.length - 1, k - 1, target);
    }

    private static int quickSelect(int[] readings, int left, int right, int k, int target) {
        while (left <= right) {
            int pivotIndex = partition(readings, left, right, target);
            if (pivotIndex == k) {
                return readings[pivotIndex];
            } else if (pivotIndex < k) {
                left = pivotIndex + 1;
            } else {
                right = pivotIndex - 1;
            }
        }
        return -1;
    }

    private static int partition(int[] readings, int left, int right, int target) {
        int pivotIndex = left + new Random().nextInt(right - left + 1);
        int pivotValue = Math.abs(readings[pivotIndex] - target);
        swap(readings, pivotIndex, right);
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (Math.abs(readings[i] - target) < pivotValue) {
                swap(readings, storeIndex, i);
                storeIndex++;
            }
        }
        swap(readings, storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] readings, int i, int j) {
        int temp = readings[i];
        readings[i] = readings[j];
        readings[j] = temp;
    }

    public static void main(String[] args) {
        int[] readings = {72, 75, 68, 80, 74};
        int target = 73;
        int k = 2;
        System.out.println(findKthClosest(readings, target, k)); // Output: 74
    }
}
