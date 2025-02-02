import java.util.Scanner;
public class Practical_1_9 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five digit integer : ");
        int num = sc.nextInt();
        int[] rem = new int[5];

        if(num>10000 && num<99999){
            for(int i=4; i>=0; i--) {
                rem[i] = (num % 10) + 1;
                num = num / 10;
            }

            for(int i=0; i<5; i++) {
                System.out.print(rem[i]);
            }
        }
        else{
        System.out.println("Enter Valid Number!!!!!");
        }

        sc.close();

    }
}
