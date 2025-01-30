import java.util.Scanner;

public class Practical_1_7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character:- ");
        char letter = sc.next().toLowerCase().charAt(0);

        // if(Character.isLetter(letter)) { // or
        if(letter >= 'a' && letter <= 'z') {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is vowel!");
            } else {
                System.out.println(letter + " is consonant");
            }
        }

        sc.close();
    }
}
