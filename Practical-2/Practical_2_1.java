// public class Practical_2_1 {
//     public static void main(String args[]) {
//         int[][] matrix = new int[6][6];
//         int i, j;

//         //Entering 0's and 1's in the matrix
//         for(i=0; i<6; i++) {
//             for(j=0; j<6; j++) {
//                 if((i + j)%2 == 0) {
//                     matrix[i][j] = 0;
//                 }
//                 else {
//                     matrix[i][j] = 1;
//                 }
//             }
//         }

//         //Displaying the matrix
//         for(i=0; i<6; i++) {
//             for(j=0; j<6; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         //Checking that each rows and columns has odd number of 1's
//         for(i=0; i<6; i++) {
//             int row_count = 0;
//             for(j=0; j<6; j++) {
//                 if(matrix[i][j] == 1) {
//                     row_count++;
//                 }
//             }
//             if(row_count % 2 != 0) {
//                 System.out.println("Each row has odd number of 1's");
//             }
//         }

//         for(j=0; j<6; j++) {
//             int col_count = 0;
//             for(i=0; i<6; i++) {
//                 if(matrix[j][i] == 1) {
//                     col_count++;
//                 }
//             }
//             if(col_count % 2 != 0) {
//                 System.out.println("Each column has odd number of 1's");
//             }
//         }
//     }
// }

import java.util.Random;
public class Practical_2_1 {
    public static void main(String args[]) {
        int size = 6;
        int[][] matrix = new int[size][size];
        Random rand = new Random();

        // Step 1: Fill the matrix row-wise ensuring odd number of 1s in each row
        for (int i = 0; i < size; i++) {
            int onesCount = 0;
            for (int j = 0; j < size - 1; j++) {
                matrix[i][j] = rand.nextInt(2); // Randomly assign 0 or 1
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            // Ensure odd number of 1s in the row
            matrix[i][size - 1] = (onesCount % 2 == 0) ? 1 : 0;
        }

        // Step 2: Adjust columns to ensure each has an odd number of 1s
        for (int j = 0; j < size; j++) {
            int onesCount = 0;
            for (int i = 0; i < size; i++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            // If the count is even, flip the last element in the column
            if (onesCount % 2 == 0) {
                matrix[size - 1][j] = (matrix[size - 1][j] == 1) ? 0 : 1;
            }
        }

        // Step 3: Display the matrix
        System.out.println("Generated 6x6 Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Step 4: Verify every row and column has an odd number of 1s
        boolean isValid = true;
        for (int i = 0; i < size; i++) {
            int rowCount = 0, colCount = 0;
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] == 1) rowCount++;
                if (matrix[j][i] == 1) colCount++;
            }
            if (rowCount % 2 == 0 || colCount % 2 == 0) {
                isValid = false;
                break;
            }
        }

        // Step 5: Display final result
        if (isValid) {
            System.out.println("Every row and column has an odd number of 1s.");
        } else {
            System.out.println("Some rows or columns do not have an odd number of 1s.");
        }
    }
}
