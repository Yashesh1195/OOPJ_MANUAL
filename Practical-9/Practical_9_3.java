// import java.util.ArrayList;
// import java.util.Collections;

// public class Practical_9_3 {

//     // Generic binary search method
//     public static <E extends Comparable<E>> int binarySearch(ArrayList<E> list, E key) {
//         int low = 0;
//         int high = list.size() - 1;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             E midVal = list.get(mid);

//             int comparison = midVal.compareTo(key);

//             if (comparison == 0) {
//                 return mid; // Key found
//             } else if (comparison < 0) {
//                 low = mid + 1; // Search in the right half
//             } else {
//                 high = mid - 1; // Search in the left half
//             }
//         }
//         return -1; // Key not found
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         Collections.addAll(list, 5, 10, 15, 20, 25, 30, 35, 40);
//         int key = 25;

//         // Make sure the list is sorted before using binary search
//         Collections.sort(list);

//         int result = binarySearch(list, key);
//         if (result != -1) {
//             System.out.println("Element " + key + " found at index: " + result);
//         } else {
//             System.out.println("Element " + key + " not found in the list.");
//         }
//     }
// }


import java.util.*;

public class Practical_9_3 {

    // Generic binary search method
    public static <E extends Comparable<E>> int binarySearch(List<E> list, E key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            E midVal = list.get(mid);

            int cmp = key.compareTo(midVal);
            if (cmp < 0) {
                high = mid - 1;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                return mid; // key found
            }
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter integers (type -1 to stop):");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;
            list.add(num);
        }

        Collections.sort(list); // sort the list in ascending order
        System.out.println("Sorted list: " + list);

        System.out.print("Enter the number to search: ");
        int key = scanner.nextInt();

        int index = binarySearch(list, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index + ".");
        } else {
            System.out.println("Element " + key + " not found.");
        }

        scanner.close();
    }
}
