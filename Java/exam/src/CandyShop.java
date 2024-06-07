import java.util.ArrayList;
import java.util.List;


class CandyShop {
    private List<Candy> candies = new ArrayList<>();
    private PriceCalculationStrategy priceCalculator;

    public CandyShop(PriceCalculationStrategy priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    public void addCandy(CandyFactory candyFactory) {
        candies.add(candyFactory.createCandy());
    }

    public double calculateTotalPrice() {
        return priceCalculator.execute(candies);
    }
}