import java.util.Scanner;

public class Practical_9_1 {

    public static String dec2Bin(int value) {
        if (value == 0) {
            return "0";
        } else if (value == 1) {
            return "1";
        } else {
            return dec2Bin(value / 2) + (value % 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        if (decimal < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            String binary = dec2Bin(decimal);
            System.out.println("Binary equivalent: " + binary);
        }

        scanner.close();
    }
}