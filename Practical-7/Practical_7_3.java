import java.io.*;
import java.util.*;

public class Practical_7_3 {

    public static void main(String[] args) {
        String fileName = "Practical7.txt";
        File file = new File(fileName);

        try {
            // Step 1: Create file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists: " + fileName);
            }

            // Step 2: Write 100 random integers to file
            PrintWriter writer = new PrintWriter(file);
            Random rand = new Random();

            for (int i = 0; i < 100; i++) {
                int number = rand.nextInt(1000); // generate integer between 0 to 999
                writer.print(number + " ");
            }
            writer.close();
            System.out.println("100 random integers written to the file.");

            // Step 3: Read integers back from the file
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> numbers = new ArrayList<>();

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            scanner.close();

            // Step 4: Sort the list
            Collections.sort(numbers);

            // Step 5: Display the sorted list
            System.out.println("Sorted integers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
