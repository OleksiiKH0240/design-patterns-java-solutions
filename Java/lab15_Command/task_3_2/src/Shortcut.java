public class Shortcut implements Command {
    private final String name;

    Shortcut(String name) {
        this.name = name;
    }

    public void press() {
        System.out.println(this.name + " shortcut pressed.");
    }

    @Override
    public void execute() {
        this.press();
    }
}
