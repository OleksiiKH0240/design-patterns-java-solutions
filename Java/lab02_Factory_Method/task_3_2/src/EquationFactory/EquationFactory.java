package EquationFactory;

import Equations.IEquation;

public abstract class EquationFactory {
    protected boolean detailedOutput;
    public abstract IEquation createEquation(String[] coefficients);
}
