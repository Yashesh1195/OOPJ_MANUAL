class Shape {
    void volume() {
        System.out.println("Volume calculation not implemented for base class.");
    }
}

class Cube extends Shape {
    double side;
    
    Cube(double side) {
        this.side = side;
    }
    
    void volume() {
        System.out.println("Volume of Cube: " + (side * side * side));
    }
}

class RectangularCube extends Shape {
    double length, width, height;
    
    RectangularCube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    void volume() {
        System.out.println("Volume of Rectangular Cube: " + (length * width * height));
    }
}

class Sphere extends Shape {
    double radius;
    
    Sphere(double radius) {
        this.radius = radius;
    }
    
    void volume() {
        System.out.println("Volume of Sphere: " + ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3)));
    }
}

public class Practical_4_4 {
    public static void main(String[] args) {
        Shape cube = new Cube(5);
        Shape rectangularCube = new RectangularCube(4, 6, 8);
        Shape sphere = new Sphere(3);
        
        cube.volume();
        rectangularCube.volume();
        sphere.volume();
    }
}
