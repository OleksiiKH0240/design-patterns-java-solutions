package Equations;


public class QuadraticEquation extends Equation {
    protected double a;

    public QuadraticEquation(String a, String b, String c) {
        super(b, c);
        this.a = Double.parseDouble(a);
    }

    public QuadraticEquation(QuadraticEquation other) {
        super(other);
        this.a = other.a;
    }

    @Override
    public double[] solve() {
        if (a == 0) {
            return super.solve();
        }
        double d = this.a * this.a - 4 * a * c;
        if (d < 0) {
            throw new ArithmeticException("There is no solution for equation.");
        }
        if (d == 0) {
            return new double[]{-this.a / (2 * a)};
        }
        return new double[]{(-this.a + Math.sqrt(d)) / (2 * a), (-this.a - Math.sqrt(d)) / (2 * a)};
    }

    @Override
    public String toString() {
        return String.format("%.0fx^2 + %.0fx + %.0f = 0", a, b, c);
    }

    @Override
    public EquationInterface clone() {
        return new QuadraticEquation(this);
    }
}
