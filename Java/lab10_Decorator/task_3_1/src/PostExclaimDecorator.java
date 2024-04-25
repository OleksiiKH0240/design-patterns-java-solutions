public class PostExclaimDecorator extends BaseDecorator {
    PostExclaimDecorator(PrintableInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("!");
    }
}
