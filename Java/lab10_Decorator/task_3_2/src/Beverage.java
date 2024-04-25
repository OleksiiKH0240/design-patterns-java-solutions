abstract public class Beverage implements BeverageInterface {

    @Override
    public abstract String description();

    @Override
    public abstract float cost();

    @Override
    public String toString() {
        return "Beverage: " + this.description() + ", $" + this.cost();
    }
}
