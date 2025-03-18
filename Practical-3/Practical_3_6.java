class Point {
    int x;
    int y;

    Point() {
        x = y = 5;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

public class Practical_3_6 {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(4, 5);
        Point p3 = new Point(p2);

        System.out.print("P1: ");
        p1.display();
        System.out.print("P2: ");
        p2.display();
        System.out.print("P3 (Copy of P2): ");
        p3.display();
    }
}
