public class UniversalCommand implements Command {
    private final Command[] commands;

    public UniversalCommand(Command... commands) {
        this.commands = commands;
    }

    @Override
    public void on() {
        for (Command command : commands) {
            command.on();
        }
    }

    @Override
    public void off() {
        for (Command command : commands) {
            command.off();
        }
    }
}
