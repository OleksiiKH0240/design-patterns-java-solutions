public class Calculator {
    private OperationStrategy strategy;

    public Calculator(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int a, int b) {
        return strategy.execute(a, b);
    }
}
