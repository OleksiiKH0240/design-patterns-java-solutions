package EquationFactory;

import Equations.IEquation;
import Equations.QuadraticEquation;

public class QuadraticEquationFactory extends EquationFactory {
    public QuadraticEquationFactory(boolean detailedOutput) {
        this.detailedOutput = detailedOutput;
    }

    @Override
    public IEquation createEquation(String[] coefficients) {
        if (coefficients.length != 3) {
            throw new IllegalArgumentException("wrong number of coefficients");
        }
        if (detailedOutput)
            System.out.println("Creating QuadraticEquation: " + coefficients[0] + "x^2 + "
                    + coefficients[1] + "x + " + coefficients[2] + " = 0");
        return new QuadraticEquation(coefficients[0], coefficients[1], coefficients[2]);
    }
}
