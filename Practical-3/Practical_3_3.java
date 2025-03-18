class CartesianPoint {
    int x;
    int y;

    CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    CartesianPoint(int value) {
        this.x = value;
        this.y = value;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    void move(int newValue) {
        this.x = newValue;
        this.y = newValue;
    }

    void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }

}

public class Practical_3_3 {
    public static void main(String[] args) {
        CartesianPoint p1 = new CartesianPoint(5, 6);
        CartesianPoint p2 = new CartesianPoint(4);

        //Initial Values
        System.out.println("P1: ");
        p1.display();
        System.out.println("P2: ");
        p2.display();

        //Assigning new values
        p1.move(8, 9);
        p2.move(7);

        //New Values
        System.out.println("P1: ");
        p1.display();
        System.out.println("P2: ");
        p2.display();
    }
}
