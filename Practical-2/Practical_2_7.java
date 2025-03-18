import java.util.Scanner;
public class Practical_2_7 {
    public static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                prefix.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two strings
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String commonPrefix = findCommonPrefix(firstString, secondString);

        // Display the result
        if (!commonPrefix.isEmpty()) {
            System.out.println("The largest common prefix is: " + commonPrefix);
        } else {
            System.out.println("No common prefix found.");
        }

        scanner.close();
    }
}
