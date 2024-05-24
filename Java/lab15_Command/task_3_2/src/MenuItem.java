public class MenuItem implements Command {
    private final String name;

    MenuItem(String name) {
        this.name = name;
    }

    public void select() {
        System.out.println(this.name + " menuitem selected.");
    }

    public void execute() {
        this.select();
    }
}
