public class PostEndlDecorator extends BaseDecorator {
    PostEndlDecorator(PrintableInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\n");
    }
}
