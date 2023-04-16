package entity;

import java.util.HashMap;

public class Ingredients {
    private static float water;
    private static float milk;
    private static float coffeeBeans;

    public static float getWater() {
        return water;
    }

    public static void setWater(float water) {
        Ingredients.water = water;
    }

    public static float getMilk() {
        return milk;
    }

    public static void setMilk(float milk) {
        Ingredients.milk = milk;
    }

    public static float getCoffeeBeans() {
        return coffeeBeans;
    }

    public static void setCoffeeBeans(float coffeeBeans) {
        Ingredients.coffeeBeans = coffeeBeans;
    }

}
