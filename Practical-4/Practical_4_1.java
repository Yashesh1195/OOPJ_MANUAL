class WordProcessor {
    String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverseWord(word));
    }
}

class PalindromeChecker extends WordProcessor {
    void checkWords(String[] words) {
        for (String word : words) {
            String reversed = reverseWord(word);
            boolean palindrome = isPalindrome(word);
            System.out.println("Word: " + word + ", Reversed: " + reversed + ", Palindrome: " + palindrome);
        }
    }
}

public class Practical_4_1 {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly 5 words as command-line arguments.");
            return;
        }
        
        PalindromeChecker checker = new PalindromeChecker();
        checker.checkWords(args);
    }
}