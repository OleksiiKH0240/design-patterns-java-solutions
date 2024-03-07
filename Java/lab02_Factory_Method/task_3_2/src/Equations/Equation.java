package Equations;

// class describe linear equation bx + c = 0
public class Equation implements IEquation {
    protected double b;
    protected double c;

    public Equation(String b, String c) {
        this.b = Double.parseDouble(b);
        this.c = Double.parseDouble(c);
    }

    @Override
    public double[] solve() {
        if (b == 0 && c!= 0) {
            throw new ArithmeticException("Equation has no solution");
        }
        if (b == 0 && c == 0) {
            throw new ArithmeticException("Equation has infinite number of solutions");
        }
        return new double[] { -c / b };
    }

    @Override
    public String toString() {
        return String.format("%.0fx + %.0f = 0", b, c);
    }
}
