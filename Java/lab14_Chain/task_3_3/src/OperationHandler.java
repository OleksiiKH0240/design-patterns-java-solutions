public abstract class OperationHandler {
    protected OperationHandler nextHandler;

    public void setNextHandler(OperationHandler nextOpener) {
        this.nextHandler = nextOpener;
    }

    public abstract double calculate(String operation, int operand1, int operand2);
}
