import java.util.Scanner;
public class Practical_1_11_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size:- ");
        // int n = sc.nextInt();
        // int count = 1;
        // for(int i=0; i<n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(count);
        //         count++;
        //     }
        //     System.out.println();
        // }

        int[] num = {1234, 567, 89, 0};

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }

        sc.close();
    }
}
