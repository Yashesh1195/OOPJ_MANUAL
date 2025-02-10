import java.util.Scanner;
public class Practical_2_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("String : " + str);

        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.toLowerCase().charAt(i)=='a' || str.toLowerCase().charAt(i)=='e' ||str.toLowerCase().charAt(i)=='i' ||str.toLowerCase().charAt(i)=='o' ||str.toLowerCase().charAt(i)=='u') {
                vowelCount++;
            }
            else if(str.toLowerCase().charAt(i) != ' '){
                consonantCount++;
            }
        }

        System.out.println("Number of vowels : " + vowelCount);
        System.out.println("Number of consonant : " + consonantCount);

        sc.close();
    }
}
