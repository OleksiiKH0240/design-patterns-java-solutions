public class PostSpaceDecorator extends BaseDecorator {
    PostSpaceDecorator(PrintableInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" ");
    }
}
