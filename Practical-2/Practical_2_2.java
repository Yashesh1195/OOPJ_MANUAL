import java.util.Arrays;
import java.util.Scanner;
public class Practical_2_2 {

    public static String findMinAndIndices(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        String indices = ""; // To store the indices as a string

        //Find the minimum element and track its indices
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    indices = "(" + i + "," + j + ")"; // Reset string if new min found
                } else if (matrix[i][j] == min) {
                    indices = indices.concat(", (" + i + "," + j + ")"); // Append if another min found
                }
            }
        }

        // Step 2: Return the result as a formatted string
        return "Minimum Element: " + min + "\nIndices: " + indices;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of n*n matrix: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];

        //Taking input of the matrix
        System.out.println("Enter the values on matrix: ");
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Get minimum element and its indices
        String result = findMinAndIndices(matrix);
        System.out.println("\n" + result);

        sc.close();
    }
}
