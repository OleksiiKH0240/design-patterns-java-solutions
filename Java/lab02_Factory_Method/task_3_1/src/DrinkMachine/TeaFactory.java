package DrinkMachine;

import Drinks.*;

public class TeaFactory extends DrinkFactory {
    @Override
    public HotDrink makeDrink(DrinkType drinkType, int sugar) {
        HotDrink drink;

        if (drinkType instanceof TeaType) {
            switch ((TeaType) drinkType) {
                case BLACKTEA -> {
                    drink = new BlackTea(sugar);
                    System.out.println("black tea with " + sugar + " sugar. Price: " + drink.getPrice());
                    return drink;
                }
                case GREENTEA -> {
                    drink = new GreenTea(sugar);
                    System.out.println("green tea with " + sugar + " sugar. Price: " + drink.getPrice());
                    return drink;
                }
                default -> throw new IllegalArgumentException("Wrong drink type");
            }
        } else {
            throw new IllegalArgumentException("Wrong drink type");
        }
    }
}
