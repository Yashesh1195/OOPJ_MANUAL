class FirstArgumentZeroException extends Exception {
    public FirstArgumentZeroException(String message) {
        super(message);
    }
}

public class Practical_6A_5 {
    public static void main(String[] args) {
        try {
            // Step 1: Check if argument is passed
            if (args.length == 0) {
                System.out.println("Please provide at least one command-line argument.");
                return;
            }

            // Step 2: Parse the first argument to integer
            int num = Integer.parseInt(args[0]);
            System.out.println("Received argument: " + num);

            // Step 3: Check if the argument is zero
            if (num == 0) {
                throw new FirstArgumentZeroException("First argument is zero! Custom Exception thrown.");
            }

            // Step 4: Continue normal execution
            System.out.println("First argument is valid and non-zero. Program executed successfully.");

        } catch (FirstArgumentZeroException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Argument must be an integer. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}
