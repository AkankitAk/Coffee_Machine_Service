package coffeeService;

import entity.Ingredients;

public class LatteCoffee implements ICoffee{
    @Override
    public void coffeeType() {
        if (Ingredients.getWater()>350 &&
            Ingredients.getMilk()>75 &&
            Ingredients.getCoffeeBeans()>20){
            Ingredients.setWater(Ingredients.getWater()-350);
            Ingredients.setMilk(Ingredients.getMilk()-75);
            Ingredients.setCoffeeBeans(Ingredients.getCoffeeBeans()-20);
            System.out.println("Thank you for choosing our coffee, we hope you enjoy it!");
            System.out.println("--------------------------------------------------------");
        }
        else {
            System.out.println("Ingredient not sufficient please try after some time");
            System.out.println("----------------------------------------------------");
        }
    }
}
