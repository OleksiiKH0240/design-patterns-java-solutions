public class Caretaker {
    private final Triangle triangle;
    private Memento memento;

    public Caretaker(Triangle triangle) {
        this.triangle = triangle;
    }

    public void save() {
        this.memento = triangle.saveState();
    }

    public void restore() {
        if (this.memento != null) {
            triangle.restoreState(memento);
        }
    }
}
