import java.util.Scanner;
public class Practical_1_11_4    {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size:- ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
