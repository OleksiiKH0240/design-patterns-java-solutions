public abstract class Coffee extends Beverage {
    public Coffee(int sugar, BeverageType type) {
        super(sugar, type);
    }

    @Override
    public void prepare() {
        System.out.println("beverage type: " + type.name());
        System.out.println("Put some coffee...");
    }

    @Override
    public int cost() {
        return 10;
    }
}
