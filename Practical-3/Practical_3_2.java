class Rectangle {
    double width;    
    double height;
    
    //Default Constructor
    Rectangle() {
        width = height = 1;
    }

    //Parametrized Constructor
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getParameter() {
        return 2 * (width + height);
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }
}

public class Practical_3_2 {
    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        //Rectangle 1
        System.out.println("Rectangle 1:");
        System.out.println("Width : " + rect1.getWidth());
        System.out.println("Height : " + rect1.getHeight());
        System.out.println("Area : " + rect1.getArea());
        System.out.println("Parameter : " + rect1.getParameter());
        
        //Rectangle 2
        System.out.println("Rectangle 2:");
        System.out.println("Width : " + rect2.getWidth());
        System.out.println("Height : " + rect2.getHeight());
        System.out.println("Area : " + rect2.getArea());
        System.out.println("Parameter : " + rect2.getParameter());

    }
}
