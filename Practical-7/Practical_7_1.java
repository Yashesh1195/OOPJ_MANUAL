import java.io.*;
import java.util.*;

public class Practical_7_1 {
    
    // Method to remove all occurrences of a specified string from the file
    public static void removeStringFromFile(String target, String fileName) throws IOException {
        File file = new File(fileName);
        
        if (!file.exists()) {
            System.out.println("Error: File not found.");
            return;
        }
        
        // Read the file content
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder fileContent = new StringBuilder();
        String line;
        boolean found = false;

        // Read the file line by line
        while ((line = reader.readLine()) != null) {
            // Check if the string is found in the current line
            if (line.contains(target)) {
                found = true;
            }
            // Remove the target string from the line
            fileContent.append(line.replace(target, "")).append(System.lineSeparator());
        }
        reader.close();

        if (!found) {
            System.out.println("Error: The string '" + target + "' is not present in the file.");
            return;
        }

        // Write the modified content back to the file
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(fileContent.toString());
        writer.close();

        System.out.println("Successfully removed all occurrences of '" + target + "' from the file.");
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Practical7_1 <string_to_remove> <file_name>");
            return;
        }
        
        String targetString = args[0];
        String fileName = args[1];

        try {
            removeStringFromFile(targetString, fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
