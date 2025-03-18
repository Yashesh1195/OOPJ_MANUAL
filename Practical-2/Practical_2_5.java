import java.util.Arrays;
public class Practical_2_5 {
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Get the length of the array

        // Outer loop: Moves the boundary of the unsorted part
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; 

            // Inner loop: Finds the smallest element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { 
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex]; 
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11, 90, 34, 78, 50, 5};
        
        // Display original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        selectionSort(numbers);

        // Display sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
