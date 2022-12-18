import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqueareRootTest {
    private final Double[] EMPTY_ARRAY = new Double[2];

    @Test
    void checkRoot_noRoot() {
        // x^2 + 1 = 0
        double a = 1;
        double b = 0;
        double c = 1;

        Assertions.assertArrayEquals(EMPTY_ARRAY, SquareRoot.solve(a, b, c));
    }

    @Test
    void checkRoot_twoRoots() {
        // x^2 - 1 = 0
        double a = 1;
        double b = 0;
        double c = -1;

        double d = b * b - 4 * a * c;

        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        Assertions.assertArrayEquals(new Double[]{x1, x2}, SquareRoot.solve(a, b, c));
    }

    @Test
    void checkRoot_oneRoots() {
        // x^2 + 2*x + 1 = 0
        double a = 1;
        double b = 2;
        double c = 1;

        double x1 = b/(2*a);
        double x2 = b/(2*a);

        Assertions.assertArrayEquals(new Double[]{x1, x2}, SquareRoot.solve(a, b, c));
    }
    @Test
    void checkSolve_notZero() {
        // a != 0
        double a = 0;
        double b = 2;
        double c = 1;

        Assertions.assertThrows(IllegalArgumentException.class, () -> SquareRoot.solve(a, b, c), "'a' must not be zero!");
    }

    @Test
    void checkRoot_nearEpsilon() {
        double a = 1.0e-11;
        double b = 0;
        double c = 1.0e-12;

        double x1 = b/(2*a);
        double x2 = b/(2*a);
        Assertions.assertArrayEquals(new Double[]{x1, x2}, SquareRoot.solve(a, b, c));
    }

    @Test
    void checkSolve_NaN() {
        // a != 0
        double a = Double.NaN;
        double b = 2;
        double c = 1;

        Assertions.assertThrows(IllegalArgumentException.class, () -> SquareRoot.solve(a, b, c), "NaN detected!");
    }

    @Test
    void checkSolve_infinity() {
        // a != 0
        double a = Double.NEGATIVE_INFINITY;
        double b = 2;
        double c = 1;

        Assertions.assertThrows(IllegalArgumentException.class, () -> SquareRoot.solve(a, b, c), "Infinity detected!");
    }
}
