package Drinks;

import DrinkFactory.IngredientType;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Americano extends HotDrink {
    private static final int basePrice = 20;
    private static final Dictionary<IngredientType, Double> ingredients = new Hashtable<>() {
        {
            put(IngredientType.WATER, 0.2);
            put(IngredientType.COFFEEBEANS, 0.1);
        }
    };

    public Americano(int sugar) {
        this.sugar = sugar;

        if (sugar < 0) {
            this.sugar = 0;
            System.out.println("Sugar amount can not be less than 0. Setting sugar amount to 0.");
        }
    }

    @Override
    public double getPrice() {
        double ingredientPrice = 0.0;
        Enumeration<IngredientType> ingredientTypeEnumeration = ingredients.keys();
        while (ingredientTypeEnumeration.hasMoreElements()) {
            IngredientType ingredient = ingredientTypeEnumeration.nextElement();
            ingredientPrice += ingredient.getPrice() * ingredients.get(ingredient);
        }

        return basePrice + ingredientPrice + sugar * IngredientType.SUGAR.getPrice();
    }
}
