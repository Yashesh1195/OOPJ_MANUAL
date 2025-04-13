import java.util.ArrayList;
import java.util.Scanner;

public class Practical_9_2 {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for (E element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();

        System.out.println("Enter elements (type 'end' to stop):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            inputList.add(input);
        }

        ArrayList<String> uniqueList = removeDuplicates(inputList);
        System.out.println("List after removing duplicates: " + uniqueList);
        scanner.close();
    }
}
