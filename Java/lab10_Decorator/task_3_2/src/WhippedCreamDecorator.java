public class WhippedCreamDecorator extends BaseDecorator {
    private final int whippedCream;

    WhippedCreamDecorator(BeverageInterface beverage, int whippedCream) {
        super(beverage);
        this.whippedCream = whippedCream;
    }

    @Override
    public String description() {
        return super.description() + ", whippedCream: " + whippedCream;
    }

    @Override
    public float cost() {
        return super.cost() + (whippedCream * 0.5f);
    }
}

