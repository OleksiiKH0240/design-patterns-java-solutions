public class Canvas {

    public static void main(String[] args) {

        CheckboxButton checkboxButton = new CheckboxButton(new SmallSize());
        checkboxButton.draw();

        RadioButton radioButton = new RadioButton(new MediumSize());
        radioButton.draw();

        DropdownButton dropdownButton = new DropdownButton(new LargeSize());
        dropdownButton.draw();

        ImageButton imageButton = new ImageButton(new UserSize(1920, 1080));
        imageButton.draw();
    }

}
