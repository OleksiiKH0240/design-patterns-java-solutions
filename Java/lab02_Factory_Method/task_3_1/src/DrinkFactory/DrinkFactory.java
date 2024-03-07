package DrinkFactory;

import Drinks.HotDrink;

public abstract class DrinkFactory {
    public abstract HotDrink makeDrink(DrinkType drinkType, int sugar);
}
