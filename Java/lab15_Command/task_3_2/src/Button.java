public class Button implements Command {
    private final String name;

    Button(String name) {
        this.name = name;
    }

    public void click() {
        System.out.println(this.name + " button clicked");
    }

    @Override
    public void execute() {
        this.click();
    }
}
