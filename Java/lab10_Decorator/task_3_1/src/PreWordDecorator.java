public class PreWordDecorator extends BaseDecorator {
    private final String word;

    PreWordDecorator(PrintableInterface component, String word) {
        super(component);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(this.word);
        super.print();
    }
}
