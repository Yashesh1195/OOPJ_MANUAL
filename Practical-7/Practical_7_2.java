import java.io.*;

public class Practical_7_2 {
    
    // Method to count characters, words, and lines in the file
    public static void countFileStatistics(String fileName) throws IOException {
        File file = new File(fileName);
        
        if (!file.exists()) {
            System.out.println("Error: File not found.");
            return;
        }

        BufferedReader reader = new BufferedReader(new FileReader(file));
        
        int numChars = 0;
        int numWords = 0;
        int numLines = 0;
        String line;
        
        // Reading the file line by line
        while ((line = reader.readLine()) != null) {
            numLines++;  // Count the line
            numChars += line.length();  // Count characters in the line
            
            // Split the line into words using whitespace as the delimiter
            String[] words = line.split("\\s+");
            numWords += words.length;  // Count the number of words in the line
        }
        
        reader.close();
        
        System.out.println("File Statistics:");
        System.out.println("Number of lines: " + numLines);
        System.out.println("Number of words: " + numWords);
        System.out.println("Number of characters: " + numChars);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Practical7_2 <file_name>");
            return;
        }
        
        String fileName = args[0];

        try {
            countFileStatistics(fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
