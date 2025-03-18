public class Practical_3_1 {
    public static void main(String[] args) {
        // Array for number-to-word conversion (1 to 20)
        String[] numberWords = {"", "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth",
                                 "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth", "Sixteenth", "Seventeenth",
                                 "Eighteenth", "Nineteenth", "Twentieth"};
        
        int count = args.length;
        System.out.println("Number of arguments = " + count);
        
        for (int i = 0; i < count; i++) {
            if (i + 1 <= 20) { // Ensure index is within bounds
                System.out.println((i + 1) + ": " + numberWords[i + 1] + " Student Name is = " + args[i]);
            } else {
                System.out.println((i + 1) + ": Student Name is = " + args[i]); // Default if more than 20
            }
        }
    }
}
