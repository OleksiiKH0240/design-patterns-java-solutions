import Equations.*;


public class Main {
    public static void main(String[] args) {
        EquationInterface[] equations = new EquationInterface[3 * 2];

        equations[0] = new Equation("10", "25");
        equations[1] = new QuadraticEquation("12", "3", "32");
        equations[2] = new BiQuadraticEquation("13", "4", "33");

        for (int i = 3; i < 6; i++) {
            equations[i] = equations[i % 3].clone();
        }

        for (EquationInterface equation : equations) {
            System.out.println(equation);
        }
    }
}
