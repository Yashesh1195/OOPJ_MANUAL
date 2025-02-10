import java.util.Scanner;
public class Practical_2_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] result = new int[3][3];

        //Enter data in Marix 1
        System.out.println("Enter elements of Matrix 1:-");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        //Enter data in Marix 2
        System.out.println("Enter elements of Matrix 2:-");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        //Displaying Matrix 1
        System.out.println("Matrix 1:-");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        //Displaying Matrix 2
        System.out.println("Matrix 2:-");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        //Choosing Matrix Operation to be done
        System.out.println("Choose an operation:- \n+ :- Addition\n- :- Subtraction\n* :- Multiplication");
        int choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                result = addMatrices(matrix1, matrix2);
                System.out.println("Result of Addition:");
                break;
            case '-':
                result = subtractMatrices(matrix1, matrix2);
                System.out.println("Result of Subtraction:");
                break;
            case '*':
                result = multiplyMatrices(matrix1, matrix2);
                System.out.println("Result of Multiplication:");
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        printMatrix(result);
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
