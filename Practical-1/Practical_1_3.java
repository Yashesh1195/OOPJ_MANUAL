class Practical_1_3 {
    public static void main(String[] args) {
        // Coefficients of the system of equations
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;

        // Determinant (denominator for both x and y)
        double determinant = a * d - b * c;

        // Check if the determinant is zero (system has no unique solution)
        if (determinant == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            // Cramer's rule for x and y
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;

            // Display the solution
            System.out.println("The solution is:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
