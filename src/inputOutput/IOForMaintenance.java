package inputOutput;

import entity.Ingredients;
import service.Maintenance;

import java.util.Scanner;

public class IOForMaintenance {
    Scanner sc=new Scanner(System.in);
    Maintenance fill=new Maintenance();
    public void maintainerFillIngredients(){
        System.out.println("There is no Ingredient Please fill it:");
        System.out.println("Please fill watter: ");
        long water=sc.nextLong();
        System.out.println("Please fill milk: ");
        long milk=sc.nextLong();
        System.out.println("Please fill coffee beans: ");
        long coffeeBeans=sc.nextLong();
        fill.fillIngredients(water,milk,coffeeBeans);
        System.out.println("Ingredients fill successfully ....\n" +
                "------------------------------------------------");
    }
    public void showAllIngredients(){
        System.out.println("Total amount of water: "+Ingredients.getWater());
        System.out.println("Total amount of milk: "+Ingredients.getMilk());
        System.out.println("Total amount of coffee beans: "+Ingredients.getCoffeeBeans());
        System.out.println("------------------------------------------------");
    }
}
