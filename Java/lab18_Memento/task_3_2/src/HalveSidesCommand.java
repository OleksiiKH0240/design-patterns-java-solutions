public class HalveSidesCommand implements Command {
    private Triangle triangle;
    private Caretaker caretaker;

    public HalveSidesCommand(Triangle triangle, Caretaker caretaker) {
        this.triangle = triangle;
        this.caretaker = caretaker;
    }

    @Override
    public void execute() {
        caretaker.save();
        triangle.halveSides();
    }

    @Override
    public void undo() {
        caretaker.restore();
    }
}