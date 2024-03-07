package Equations;

// class describe quadratic equation ax^2 + bx + c = 0
public class QuadraticEquation extends Equation {
    protected double a;

    public QuadraticEquation(String a, String b, String c) {
        super(b, c);
        this.a = Double.parseDouble(a);
    }

    @Override
    public double[] solve() {
        if (a == 0) {
            return super.solve();
        }
        double d = b * b - 4 * a * c;
        if (d < 0) {
            throw new ArithmeticException("Equation has no solution");
        }
        if (d == 0) {
            return new double[] { -b / (2 * a) };
        }
        return new double[] { (-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a) };
    }

    @Override
    public String toString() {
        return String.format("%.0fx^2 + %.0fx + %.0f = 0", a, b, c);
    }
}
