public class Cafe {

    public static void main(String[] args) {
        BlackChocolate blackChocolate = new BlackChocolate(3, 200, BeverageType.restaurant);
        BlackCoffee blackCoffee = new BlackCoffee(3, 200, true, BeverageType.restaurant);
        BlackTee blackTee = new BlackTee(0, 300, BeverageType.restaurant);

        beverageInfo(blackChocolate);
        beverageInfo(blackCoffee);
        beverageInfo(blackTee);

        MilkChocolate milkChocolate = new MilkChocolate(3, 200, BeverageType.takeaway);
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(3, 200, BeverageType.takeaway);
        TeeWithMilk teeWithMilk = new TeeWithMilk(2, 300, BeverageType.takeaway);

        beverageInfo(milkChocolate);
        beverageInfo(coffeeWithMilk);
        beverageInfo(teeWithMilk);
    }

    private static void beverageInfo(Beverage beverage) {

        System.out.println("=========================");

        beverage.prepare();
        System.out.printf("Cost of beverage: %s grn\n",  beverage.cost());
        beverage.drink();
    }

}
