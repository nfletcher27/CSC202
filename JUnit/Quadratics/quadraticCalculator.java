final class quadraticCalculator {

    quadraticCalculator() {
        throw new AssertionError("Instaniating utility class...");
    }

    public static void quadraticRoots(double a, double b, double c) {

        double root1, root2;
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);

        } else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);

        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }

    public static String quadraticRootsReturnsString(double a, double b, double c) {
        // still resolving this
        return "";
    }

    public static void main(String[] args) {
        quadraticRoots(1, 2, 3);
    }

}
