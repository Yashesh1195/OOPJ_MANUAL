class Shape {
    void area() {
        System.out.println("Area calculation not implemented for base class.");
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    void area() {
        System.out.println("Areaa of Square: " + (side * side));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Areaa of Square: " + (length * width));
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        System.out.println("Areaa of Square: " + (0.5 * base * height));
    }
}



public class Practical_4_3 {
    public static void main(String[] args) {
        Shape square = new Square(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);
        
        square.area();
        rectangle.area();
        triangle.area();
    }
}
