import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);

        Caretaker caretaker = new Caretaker(triangle);
        List<Command> history = new ArrayList<>();

        System.out.println("Initial triangle: " + triangle + ", area=" + triangle.square());

        Command doubleCommand = new DoubleSidesCommand(triangle, caretaker);
        Command halveCommand = new HalveSidesCommand(triangle, caretaker);

        doubleCommand.execute();
        history.add(doubleCommand);
        System.out.println("After doubling sides: area=" + triangle.square());
        System.out.println("Updated triangle: " + triangle);
        System.out.println("--------------------------------");

        halveCommand.execute();
        history.add(halveCommand);
        System.out.println("After halving sides: area=" + triangle.square());
        System.out.println("Updated triangle: " + triangle);
        System.out.println("--------------------------------");

        halveCommand.execute();
        history.add(halveCommand);
        System.out.println("After halving sides again: area=" + triangle.square());
        System.out.println("Updated triangle: " + triangle);
        System.out.println("--------------------------------");

        doubleCommand.execute();
        history.add(doubleCommand);
        System.out.println("After doubling sides again: area=" + triangle.square());
        System.out.println("Updated triangle: " + triangle);
        System.out.println("--------------------------------");

        halveCommand.execute();
        history.add(halveCommand);
        System.out.println("After halving sides again: area=" + triangle.square());
        System.out.println("Updated triangle: " + triangle);
        System.out.println("--------------------------------");

        float minArea = Float.MAX_VALUE;
        Caretaker minAreaCaretaker = new Caretaker(triangle);
        for (Command command : history) {
            float currentArea = triangle.square();
            if (currentArea < minArea) {
                minArea = currentArea;
                minAreaCaretaker.save();
            }
            command.undo();
        }

        minAreaCaretaker.restore();
        System.out.println("Restored to state with smallest area: " + triangle + ", area=" + triangle.square());
    }


}

