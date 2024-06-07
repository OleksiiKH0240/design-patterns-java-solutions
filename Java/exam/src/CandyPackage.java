import java.util.ArrayList;
import java.util.List;

// Composite
class CandyPackage extends Candy {
    private List<Candy> candies = new ArrayList<>();
    private PriceCalculationStrategy priceCalculator;
    private SugarContentCalculationStrategy sugarContentCalculator;

    CandyPackage() {
        this.priceCalculator = new PriceCalculationStrategy();
        this.sugarContentCalculator = new SugarContentCalculationStrategy();
    }

    public void add(Candy candy) {
        candies.add(candy);
    }

    public void remove(Candy candy) {
        candies.remove(candy);
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public double getPrice() {
        return this.priceCalculator.execute(this.candies);
    }

    public double getSugarContent() {
        return this.sugarContentCalculator.execute(this.candies);
    }
}
