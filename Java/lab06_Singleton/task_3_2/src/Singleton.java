import Builders.CarBuilder;

public class Singleton {
    private Director instance = null;

    public Director getInstance() {
        if (instance == null) {
            System.out.println("Creating new Director");
            this.instance = new Director(new CarBuilder());
        }

        return instance;
    }
}
