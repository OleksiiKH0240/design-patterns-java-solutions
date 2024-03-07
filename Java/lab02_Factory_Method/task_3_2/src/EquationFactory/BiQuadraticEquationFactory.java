package EquationFactory;

import Equations.BiQuadraticEquation;
import Equations.IEquation;

public class BiQuadraticEquationFactory extends EquationFactory {
    public BiQuadraticEquationFactory(boolean detailedOutput) {
        this.detailedOutput = detailedOutput;
    }

    @Override
    public IEquation createEquation(String[] coefficients) {
        if (coefficients.length != 5) {
            throw new IllegalArgumentException("wrong number of coefficients");
        }
        if (detailedOutput)
            System.out.println("Creating BiQuadraticEquation: " + coefficients[0] + "x^4 + "
                    + coefficients[2] + "x^2 + " + coefficients[4] + " = 0");
        return new BiQuadraticEquation(coefficients[0], coefficients[2], coefficients[4]);
    }
}