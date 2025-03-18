import java.util.Scanner;
class Shape {
    double dim1, dim2;
    
    void getData(double d1, double d2) {
        this.dim1 = d1;
        this.dim2 = d2;
    }
    
    void displayArea() {
        System.out.println("Area calculation not implemented for base class.");
    }
}

class Triangle extends Shape {
    void displayArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {
    void displayArea() {
        double area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Practical_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter base and height for Triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Triangle triangle = new Triangle();
        triangle.getData(base, height);
        triangle.displayArea();
        
        System.out.print("Enter length and breadth for Rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle();
        rectangle.getData(length, breadth);
        rectangle.displayArea();
        
        sc.close();
    }
}
