import java.util.Scanner;

public class Practical_6A_2 {

    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("You must be 18 or older to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 100 by: ");
            int num = sc.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            System.out.println("Caught ArithmeticException: " + ae.getMessage());
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println("Accessing 5th element: " + arr[4]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + aiobe.getMessage());
        }

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            checkAge(age);  // May throw IllegalArgumentException
        } catch (IllegalArgumentException iae) {
            System.out.println("Caught IllegalArgumentException: " + iae.getMessage());
        } finally {
            System.out.println("This is the finally block. It always runs!");
        }

        System.out.println("Program continues after exception handling.");
        sc.close();
    }
}
