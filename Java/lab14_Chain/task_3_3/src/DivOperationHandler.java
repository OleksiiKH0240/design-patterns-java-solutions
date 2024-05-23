public class DivOperationHandler extends OperationHandler {
    DivOperationHandler() {
    }

    @Override
    public double calculate(String operation, int operand1, int operand2) {
        if (operation.contains("/")) {
            return (double) operand1 / operand2;
        } else {
            if (this.nextHandler != null) {
                return this.nextHandler.calculate(operation, operand1, operand2);
            }
            throw new ArithmeticException("invalid operation");
        }
    }
}
