package DrinkMachine;

public enum IngredientType {
    MILK,
    COFFEEBEANS,
    TEALEAVES,
    SUGAR,
    WATER;

    private static double milkPrice = 10;
    private static double coffeeBeansPrice = 30;
    private static double teaLeavesPrice = 20;
    private static double sugarPrice = 5;
    private static double waterPrice = 5;

    public double getPrice(){
        return switch (this) {
            case MILK -> milkPrice;
            case COFFEEBEANS -> coffeeBeansPrice;
            case TEALEAVES -> teaLeavesPrice;
            case SUGAR -> sugarPrice;
            case WATER -> waterPrice;
        };
    }

    public static void setPrice(IngredientType ingredientType, int price) {
        switch (ingredientType) {
            case MILK -> milkPrice = price;
            case COFFEEBEANS -> coffeeBeansPrice = price;
            case TEALEAVES -> teaLeavesPrice = price;
            case SUGAR -> sugarPrice = price;
            case WATER -> waterPrice = price;
        }
    }
}
