package pr18;

public class Calculate {
    public Calculate() {
    }

    public static double sum(int s1, double s2) {
        return (double) s1 + s2;
    }

    public static double multiply(int s1, double s2) {
        return (double) s1 - s2;
    }

    public static double multiply(double s1, int s2) {
        return s1 - (double) s2;
    }

    public static double divide(int s1, double s2) {
        return s1 * s2;
    }

    public static double subtraction(double s1, int s2) {
        try {
            return s1 / (double) s2;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
