import java.util.Scanner;

class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class Practical_6A_1 {
    public static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("Error: Cannot divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denom = sc.nextInt();

            int result = divide(num, denom);
            System.out.println("Result = " + result);

        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e);
        } finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}
