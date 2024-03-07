package DrinkMachine;

import Drinks.*;


public class CoffeeFactory extends DrinkFactory {
    @Override
    public HotDrink makeDrink(DrinkType drinkType, int sugar) {
        HotDrink drink;

        if (drinkType instanceof CoffeeType) {
            switch ((CoffeeType) drinkType) {
                case ESPRESSO -> {
                    drink = new Espresso(sugar);
                    System.out.println("espresso with " + sugar + " sugar. Price: " + drink.getPrice());
                    return drink;
                }
                case AMERICANO -> {
                    drink = new Americano(sugar);
                    System.out.println("americano with " + sugar + " sugar. Price: " + drink.getPrice());
                    return drink;
                }
                case CAPPUCCINO -> {
                    drink = new Cappuccino(sugar);
                    System.out.println("cappuccino with " + sugar + " sugar. Price: " + drink.getPrice());
                    return drink;
                }
                case LATTE -> {
                    drink = new Latte(sugar);
                    System.out.println("latte with " + sugar + " sugar. Price: " + drink.getPrice());
                    return drink;
                }
                default -> throw new IllegalArgumentException("Wrong drink type");
            }
        } else {
            throw new IllegalArgumentException("Wrong drink type");
        }
    }
}
