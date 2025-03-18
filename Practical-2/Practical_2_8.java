import java.util.Scanner;
public class Practical_2_8 {
    public static boolean isValidPassword(String password) {
        // Rule 1: At least 8 characters long
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        // Rule 2 & 3: Only letters and digits, and at least 2 digits
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetter(ch)) {
                return false;
            }
        }
        // Password is valid if it has at least 2 digits
        return digitCount >= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a password
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        // Check if the password is valid
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        sc.close();
    }
}
