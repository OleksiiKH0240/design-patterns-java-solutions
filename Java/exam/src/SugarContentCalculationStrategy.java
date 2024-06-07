import java.util.List;

class SugarContentCalculationStrategy implements Strategy {
    public double execute(List<Candy> candies) {
        double maxSugarContent = 0;
        for (Candy candy : candies) {
            if (candy.getSugarContent() > maxSugarContent) {
                maxSugarContent = candy.getSugarContent();
            }
        }
        return maxSugarContent;
    }
}
