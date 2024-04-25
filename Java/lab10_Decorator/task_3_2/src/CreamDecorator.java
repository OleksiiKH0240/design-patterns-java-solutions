public class CreamDecorator extends BaseDecorator {
    private final int cream;

    CreamDecorator(BeverageInterface beverage, int cream) {
        super(beverage);
        this.cream = cream;
    }

    @Override
    public String description() {
        return super.description() + ", Cream: " + cream;
    }

    @Override
    public float cost() {
        return super.cost() + (cream * 0.4f);
    }
}
