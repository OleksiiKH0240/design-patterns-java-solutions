public class PostComaDecorator extends BaseDecorator {
    PostComaDecorator(PrintableInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(",");
    }
}
