public class SquareRoot {

    private final static double epsilon = 1.0e-12;
    // a*x^2 + b*y + c = 0
    public static Double[] solve(double a, double b, double c) {

        if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c)) {
            throw new IllegalArgumentException("NaN detected!");
        }

        if (Double.isInfinite(Math.abs(a))) {
            throw new IllegalArgumentException("Infinity detected!");
        }

        if (Math.abs(a) < epsilon) {
            throw new IllegalArgumentException("'a' must not be zero!");
        }

        double d = b*b - 4*a*c;

        if (d < -epsilon) {
            return new Double[2];
        }

        if (d > epsilon) {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);

            return new Double[]{x1, x2};
        }

        // вместо == 0
        if (Math.abs(d) <= epsilon) {
            double x1 = b/(2*a);
            double x2 = b/(2*a);
            System.out.println(x1);
            System.out.println(x2);
            return new Double[]{x1, x2};
        }

        throw new RuntimeException("Something goes wrong");
    }
}
