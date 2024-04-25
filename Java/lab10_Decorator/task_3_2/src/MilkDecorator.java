public class MilkDecorator extends BaseDecorator {
    private final int milk;

    MilkDecorator(BeverageInterface beverage, int milk) {
        super(beverage);
        this.milk = milk;
    }

    @Override
    public String description() {
        return super.description() + ", Milk: " + milk;
    }

    @Override
    public float cost() {
        return super.cost() + (milk * 0.3f);
    }
}
