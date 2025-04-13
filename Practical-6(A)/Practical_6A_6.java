import java.util.Scanner;

class IllegalMarkException extends Exception {
    public IllegalMarkException(String message) {
        super(message);
    }
}

public class Practical_6A_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter registration number: ");
            String regNo = scanner.nextLine();

            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();

            if (marks < 0) {
                throw new IllegalMarkException("Illegal Mark");
            }

            System.out.println("Registration No: " + regNo);
            if (marks >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }

        } catch (IllegalMarkException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid data.");
        } finally {
            scanner.close();
        }
    }
}
