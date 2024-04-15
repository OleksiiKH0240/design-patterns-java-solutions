public class RadioButton extends Button {

    RadioButton(Size size) {
        super(size);
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing a radio button.\n");
    }

}
