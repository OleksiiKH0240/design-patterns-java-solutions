public class ImageButton extends Button {
    ImageButton(Size size) {
        super(size);
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing a image button.\n");
    }
}
