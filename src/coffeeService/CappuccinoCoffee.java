package coffeeService;

import entity.Ingredients;

import java.util.HashMap;

public class CappuccinoCoffee implements ICoffee{
    @Override
    public void coffeeType() {
        if (Ingredients.getWater()>200 &&
                Ingredients.getMilk()>100 &&
                Ingredients.getCoffeeBeans()>12){
            Ingredients.setWater(Ingredients.getWater()-200);
            Ingredients.setMilk(Ingredients.getMilk()-100);
            Ingredients.setCoffeeBeans(Ingredients.getCoffeeBeans()-12);
            System.out.println("Thank you for choosing our coffee, we hope you enjoy it!");
            System.out.println("--------------------------------------------------------");
        }
        else {
            System.out.println("Ingredient not sufficient please try after some time");
            System.out.println("----------------------------------------------------");
        }
    }
}
