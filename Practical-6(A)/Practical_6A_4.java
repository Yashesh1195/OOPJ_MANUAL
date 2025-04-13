// public class Practical_6A_4 {

//     public static double average(String[] values) throws NullPointerException, NumberFormatException {
//         double sum = 0;
//         for (String val : values) {
//             if (val == null) {
//                 throw new NullPointerException("Null value found in array.");
//             }
//             double num = Double.parseDouble(val); // may throw NumberFormatException
//             sum += num;
//         }
//         return sum / values.length;
//     }

//     public static void main(String[] args) {
//         String[] numbers = {"10.5", "20.0", "30"};

//         try {
//             double result = average(numbers);
//             System.out.println("Average is: " + result);
//         } catch (NullPointerException e) {
//             System.out.println("Error: " + e.getMessage());
//         } catch (NumberFormatException e) {
//             System.out.println("Error: Invalid number format - " + e.getMessage());
//         }

//         System.out.println("Program completed.");
//     }
// }

import java.util.Scanner;

public class Practical_6A_4 {

    // Method to calculate average with exception handling
    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
                throw new NullPointerException("Element at index " + i + " is null.");
            }
            sum += Double.parseDouble(values[i]);
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        String[] inputs = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            String value = sc.nextLine().trim();
            inputs[i] = value.isEmpty() ? null : value;
        }

        try {
            double avg = average(inputs);
            System.out.println("Average = " + avg);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

        sc.close();
    }
}
