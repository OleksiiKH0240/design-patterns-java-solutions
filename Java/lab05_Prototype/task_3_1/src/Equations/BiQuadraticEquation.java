package Equations;


public class BiQuadraticEquation extends QuadraticEquation {

    public BiQuadraticEquation(String a, String b, String c) {
        super(a, b, c);
    }

    @Override
    public double[] solve() {
        double[] quadraticSolutions = super.solve();
        if (quadraticSolutions.length == 1) {
            if (quadraticSolutions[0] == 0) return new double[] { 0 };
            return new double[] { Math.sqrt(quadraticSolutions[0]), -Math.sqrt(quadraticSolutions[0]) };
        }
        if (quadraticSolutions.length == 2) {
            if (quadraticSolutions[0] == quadraticSolutions[1]) {
                return new double[] { Math.sqrt(quadraticSolutions[0]), -Math.sqrt(quadraticSolutions[0]) };
            }
            if (quadraticSolutions[0] < 0 && quadraticSolutions[1] > 0) {
                return new double[] { Math.sqrt(quadraticSolutions[1]), -Math.sqrt(quadraticSolutions[1]) };
            }
            if (quadraticSolutions[0] > 0 && quadraticSolutions[1] < 0) {
                return new double[] { Math.sqrt(quadraticSolutions[0]), -Math.sqrt(quadraticSolutions[0]) };
            }
            if (quadraticSolutions[0] > 0 && quadraticSolutions[1] > 0) {
                return new double[] { Math.sqrt(quadraticSolutions[0]), -Math.sqrt(quadraticSolutions[0]),
                        Math.sqrt(quadraticSolutions[1]), -Math.sqrt(quadraticSolutions[1]) };
            }

            throw new ArithmeticException("Equation has no solution");
        }
        throw new RuntimeException("unexpected behaviour");
    }

    @Override
    public String toString() {
        return String.format("%.0fx^4 + %.0fx^2 + %.0f = 0", a, b, c);
    }
}
