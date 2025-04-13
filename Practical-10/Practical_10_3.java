import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practical_10_3 {
    public static void main(String[] args) {
        // Create a map to store state-capital pairs
        Map<String, String> stateCapitalMap = new HashMap<>();

        // Add 10 state-capital pairs
        stateCapitalMap.put("Gujarat", "Gandhinagar");
        stateCapitalMap.put("Maharashtra", "Mumbai");
        stateCapitalMap.put("Rajasthan", "Jaipur");
        stateCapitalMap.put("Uttar Pradesh", "Lucknow");
        stateCapitalMap.put("Karnataka", "Bengaluru");
        stateCapitalMap.put("Tamil Nadu", "Chennai");
        stateCapitalMap.put("Punjab", "Chandigarh");
        stateCapitalMap.put("Bihar", "Patna");
        stateCapitalMap.put("West Bengal", "Kolkata");
        stateCapitalMap.put("Madhya Pradesh", "Bhopal");

        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of a state: ");
        String state = scanner.nextLine();

        // Display capital
        if (stateCapitalMap.containsKey(state)) {
            System.out.println("The capital of " + state + " is " + stateCapitalMap.get(state));
        } else {
            System.out.println("State not found in the map.");
        }

        scanner.close();
    }
}
