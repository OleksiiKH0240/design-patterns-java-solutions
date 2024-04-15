public abstract class Chocolate extends Beverage {
    public Chocolate(int sugar, BeverageType type) {
        super(sugar, type);
    }

    @Override
    public void prepare() {
        System.out.println("beverage type: " + type.name());
        System.out.println("Put some cacao...");
    }

    @Override
    public int cost() {
        return 15;
    }
}
