public class MinusOperationHandler extends OperationHandler {
    MinusOperationHandler() {
    }

    @Override
    public double calculate(String operation, int operand1, int operand2) {
        if (operation.contains("-")) {
            return operand1 - operand2;
        } else {
            if (this.nextHandler != null) {
                return this.nextHandler.calculate(operation, operand1, operand2);
            }
            throw new ArithmeticException("invalid operation");
        }
    }
}
