public class SugarDecorator extends BaseDecorator {
    private final int sugar;

    SugarDecorator(BeverageInterface beverage, int sugar) {
        super(beverage);
        this.sugar = sugar;
    }

    @Override
    public String description() {
        return super.description() + ", Sugar: " + sugar;
    }

    @Override
    public float cost() {
        return super.cost() + (sugar * 0.1f);
    }
}
