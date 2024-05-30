public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AdditionStrategy());
        int result = calculator.executeOperation(10, 5);
        System.out.println("Result: " + result);

        calculator.setStrategy(new SubtractionStrategy());
        result = calculator.executeOperation(10, 5);
        System.out.println("Result: " + result);

        calculator.setStrategy(new MultiplicationStrategy());
        result = calculator.executeOperation(10, 5);
        System.out.println("Result: " + result);
    }
}
