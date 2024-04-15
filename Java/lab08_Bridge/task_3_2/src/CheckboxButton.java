public class CheckboxButton extends Button {
    CheckboxButton(Size size) {
        super(size);
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing a checkbox button.\n");
    }
}
