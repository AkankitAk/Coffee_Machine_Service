package coffeeService;

import coffeeService.ICoffee;
import entity.Ingredients;

public class EspressoCoffee implements ICoffee {
    @Override
    public void coffeeType() {
        if (Ingredients.getWater()>250 &&
                Ingredients.getMilk()>0 &&
                Ingredients.getCoffeeBeans()>16){
            Ingredients.setWater(Ingredients.getWater()-250);
            Ingredients.setMilk(Ingredients.getMilk()-0);
            Ingredients.setCoffeeBeans(Ingredients.getCoffeeBeans()-16);
            System.out.println("Thank you for choosing our coffee, we hope you enjoy it!");
            System.out.println("--------------------------------------------------------");
        }
        else {
            System.out.println("Ingredient not sufficient please try after some time");
            System.out.println("----------------------------------------------------");
        }
    }
}
