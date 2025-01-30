import java.util.Scanner;
public class Practical_1_4 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number(in metres) = ");
		int meter = sc.nextInt();
		
		//Conversion of meter to feet
		double feet = meter * 3.28084;
		
		System.out.println("Feet = " + feet);
		
		sc.close();
	}
}
