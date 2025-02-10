public class Practical_2_1 {
    public static void main(String args[]) {
        int[][] matrix = new int[6][6];
        int i, j;

        //Entering 0's and 1's in the matrix
        for(i=0; i<6; i++) {
            for(j=0; j<6; j++) {
                if((i + j)%2 == 0) {
                    matrix[i][j] = 0;
                }
                else {
                    matrix[i][j] = 1;
                }
            }
        }

        //Displaying the matrix
        for(i=0; i<6; i++) {
            for(j=0; j<6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Checking that each rows and columns has odd number of 1's
        for(i=0; i<6; i++) {
            int row_count = 0;
            for(j=0; j<6; j++) {
                if(matrix[i][j] == 1) {
                    row_count++;
                }
            }
            if(row_count % 2 != 0) {
                System.out.println("Each row has odd number of 1's");
            }
        }

        for(j=0; j<6; j++) {
            int col_count = 0;
            for(i=0; i<6; i++) {
                if(matrix[j][i] == 1) {
                    col_count++;
                }
            }
            if(col_count % 2 != 0) {
                System.out.println("Each column has odd number of 1's");
            }
        }
    }
}
