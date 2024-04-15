public class DropdownButton extends Button {
    DropdownButton(Size size) {
        super(size);
    }

    public void draw() {
        super.draw();
        System.out.println("Drawing a dropdown button.\n");
    }

}
