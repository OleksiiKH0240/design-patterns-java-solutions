public class BaseDecorator implements PrintableInterface {
    private final PrintableInterface component;

    BaseDecorator(PrintableInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        this.component.print();
    }
}
