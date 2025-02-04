import java.util.Scanner;
import java.lang.Math;
public class Practical_1_10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of side a  : ");
        double a = sc.nextDouble();
        System.out.print("Enter length of side b  : ");
        double b = sc.nextDouble();
        System.out.print("Enter length of side c  : ");
        double c = sc.nextDouble();

        if( a + b > c && a + c > b && b + c > a)
        {
            double s = (double) (a+b+c)/2;

            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            
            System.out.printf("Area of triangle : %.2f\n", area);
        }
        else{
            System.out.println("Given dimensions do not for a valid triangle!!");
        }
        
        sc.close();

    }
}
