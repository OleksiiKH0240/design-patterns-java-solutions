public class BaseDecorator extends Beverage {

    private final BeverageInterface beverage;

    BaseDecorator(BeverageInterface beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return this.beverage.description();
    }

    @Override
    public float cost() {
        return this.beverage.cost();
    }
}
