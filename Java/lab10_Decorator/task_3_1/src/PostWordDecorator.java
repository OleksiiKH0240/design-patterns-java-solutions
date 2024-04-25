public class PostWordDecorator extends BaseDecorator {
    private final String word;

    PostWordDecorator(PrintableInterface component, String word) {
        super(component);
        this.word = word;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(this.word);
    }
}
