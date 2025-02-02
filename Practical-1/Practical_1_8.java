import java.util.Scanner;
public class Practical_1_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Available Denominations
        int[] denomination = {100, 50, 10, 5, 2, 1};
        
        System.out.print("Enter the amount to be withdrawn:- ");
        int amount = sc.nextInt();

        //Storing the note count of each denomination
        int[] noteCount = new int[denomination.length];

        //Calculation of the number of notes of each denomination
        for(int i=0; i<denomination.length; i++) {
            if(amount >= denomination[i]) {
                noteCount[i] = amount / denomination[i];
                amount %= denomination[i];
            }
        }

        System.out.println("Currency notes given:");

        for(int i=0; i<denomination.length; i++) {
            if(noteCount[i] > 0) {
                System.out.println(denomination[i] + " : " + noteCount[i]);
            }
        }

        sc.close();
        
    }
}
