package service;

import entity.Ingredients;

import java.util.HashMap;

public class Maintenance {

    public void fillIngredients(long water,long milk,long coffeeBeans){
        Ingredients.setWater(Ingredients.getWater()+water);
        Ingredients.setMilk(Ingredients.getMilk()+milk);
        Ingredients.setCoffeeBeans(Ingredients.getCoffeeBeans()+coffeeBeans);
    }
}
