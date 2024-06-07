import java.util.List;

class PriceCalculationStrategy implements Strategy {
    public double execute(List<Candy> candies) {
        double total = 0;
        for (Candy candy : candies) {
            total += candy.getPrice();
        }
        return total;
    }
}
