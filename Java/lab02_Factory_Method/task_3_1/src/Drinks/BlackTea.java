package Drinks;

import DrinkMachine.IngredientType;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class BlackTea extends HotDrink {
    private static final int basePrice = 10;
    private static final Dictionary<IngredientType, Double> ingredients = new Hashtable<>() {
        {
            put(IngredientType.WATER, 0.3);
            put(IngredientType.TEALEAVES, 0.05);
        }
    };

    public BlackTea(int sugar) {
        this.sugar = sugar;

        if (sugar < 0){
            this.sugar = 0;
            System.out.println("Sugar amount can not be less than 0. Setting sugar amount to 0.");
        }
    }

    @Override
    public double getPrice(){
        double ingredientPrice = 0.0;
        Enumeration<IngredientType> ingredientTypeEnumeration = ingredients.keys();
        while (ingredientTypeEnumeration.hasMoreElements()){
            IngredientType ingredient = ingredientTypeEnumeration.nextElement();
            ingredientPrice += ingredient.getPrice() * ingredients.get(ingredient);
        }

        return basePrice + ingredientPrice + sugar * IngredientType.SUGAR.getPrice();
    }
}
