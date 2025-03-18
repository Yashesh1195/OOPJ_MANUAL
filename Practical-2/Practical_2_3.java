// import java.util.Arrays;

// public class Praactical_2_3 {

//     public static int[] removeDuplicates(int[] arr) {
//         int n = arr.length;
//         int[] uniqueArr = new int[n];
//         int newSize = 0;
//         String uniqueElements = "";

//         for (int i = 0; i < n; i++) {
//             String elementStr = "|" + arr[i] + "|";
//             if (!uniqueElements.contains(elementStr)) {
//                 uniqueArr[newSize] = arr[i];
//                 newSize++;
//                 uniqueElements = uniqueElements.concat(elementStr);
//             }
//         }

//         // Create final array with exact size
//         return Arrays.copyOf(uniqueArr, newSize);
//     }

//     public static void main(String[] args) {
//         // Sample array with duplicates
//         int[] numbers = {5, 3, 8, 3, 5, 2, 8, 1, 2, 7};

//         // Display original array
//         System.out.println("Original Array: " + Arrays.toString(numbers));

//         // Get array without duplicates
//         int[] uniqueNumbers = removeDuplicates(numbers);

//         // Display result
//         System.out.println("Array without Duplicates: " + Arrays.toString(uniqueNumbers));
//     }
// }

import java.util.Arrays;

public class Practical_2_3 {

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n]; // Temporary array to store unique elements
        int newSize = 0;

        // Step 1: Iterate and check for unique values
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the value already exists in temp
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, add it to temp
            if (!isDuplicate) {
                temp[newSize] = arr[i];
                newSize++;
            }
        }

        // Step 2: Copy unique values to the final array
        int[] uniqueArray = Arrays.copyOf(temp, newSize);
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5, 6, 3, 7, 6}; // Sample input array

        // Display original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Remove duplicates
        int[] uniqueNumbers = removeDuplicates(numbers);

        // Display unique array
        System.out.println("Array without Duplicates: " + Arrays.toString(uniqueNumbers));
    }
}
