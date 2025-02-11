import java.util.Arrays;

public class NextGreaterElement {
    public static void findNextGreater(int[] arr, int[] result, int index) {
        if (index == arr.length) {
            return;
        }
        result[index] = -1; // Default value if no greater element is found
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[j] > arr[index]) {
                result[index] = arr[j];
                break;
            }
        }
        findNextGreater(arr, result, index + 1);
    }

    public static int[] nextGreaterElements(int[] arr) {
        int[] result = new int[arr.length];
        findNextGreater(arr, result, 0);
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(nextGreaterElements(arr1))); // [8, -1, 1, 3, -1]
        
        int[] arr2 = {1, 3, 2, 4};
        System.out.println(Arrays.toString(nextGreaterElements(arr2))); // [3, 4, 4, -1]
        
        int[] arr3 = {10, 20, 30, 50};
        System.out.println(Arrays.toString(nextGreaterElements(arr3))); // [20, 30, 50, -1]
        
        int[] arr4 = {50, 40, 30, 10};
        System.out.println(Arrays.toString(nextGreaterElements(arr4))); // [-1, -1, -1, -1]
    }
}
