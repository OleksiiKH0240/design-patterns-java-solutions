import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {

        Map<String, List<Integer>> operations = new HashMap<>();
        operations.put("+", Arrays.asList(1, 2));
        operations.put("-", Arrays.asList(1, 2));
        operations.put("*", Arrays.asList(4, 2));
        operations.put("/", Arrays.asList(1, 2));

        OperationHandler handler = new PlusOperationHandler();

        OperationHandler minusOperationHandler = new MinusOperationHandler();
        handler.setNextHandler(minusOperationHandler);

        OperationHandler mulOperationHandler = new MulOperationHandler();
        minusOperationHandler.setNextHandler(mulOperationHandler);

        OperationHandler divOperationHandler = new DivOperationHandler();
        mulOperationHandler.setNextHandler(divOperationHandler);

        for (Map.Entry<String, List<Integer>> operation : operations.entrySet()) {
            String key = operation.getKey();
            List<Integer> value = operation.getValue();

            System.out.println(key + " : " + value + " : " + handler.calculate(key, value.getFirst(), value.getLast()));
        }

    }
}
