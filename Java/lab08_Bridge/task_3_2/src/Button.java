public class Button {

    private final Size size;

    Button(Size size) {
        this.size = size;
    }

    public void draw() {
        System.out.printf("Setting size to %s...\n", size.getSize());
    }
}
