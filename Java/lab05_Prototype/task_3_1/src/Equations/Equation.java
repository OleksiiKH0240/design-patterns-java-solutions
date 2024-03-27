package Equations;


public class Equation implements EquationInterface {
    protected double b;
    protected double c;

    public Equation(String b, String c) {
        this.b = Double.parseDouble(b);
        this.c = Double.parseDouble(c);
    }

    public Equation(Equation other) {
        this.b = other.b;
        this.c = other.c;
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

    @Override
    public EquationInterface clone() {
        return new Equation(this);
    }
}
