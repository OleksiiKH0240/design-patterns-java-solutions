public class Singleton {
    private TextEditor instance = null;

    public TextEditor getInstance() {
        if (instance == null) {
            System.out.println("Creating new instance of TextEditor");
            this.instance = new TextEditor();
        }

        return instance;
    }
}
