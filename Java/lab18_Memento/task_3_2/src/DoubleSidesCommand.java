public class DoubleSidesCommand implements Command {
    private Triangle triangle;
    private Caretaker caretaker;

    public DoubleSidesCommand(Triangle triangle, Caretaker caretaker) {
        this.triangle = triangle;
        this.caretaker = caretaker;
    }

    @Override
    public void execute() {
        caretaker.save();
        triangle.doubleSides();
    }

    @Override
    public void undo() {
        caretaker.restore();
    }
}