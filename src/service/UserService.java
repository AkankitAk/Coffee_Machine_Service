package service;

import coffeeService.CappuccinoCoffee;
import coffeeService.EspressoCoffee;
import coffeeService.LatteCoffee;

import java.util.Scanner;

public class UserService {
    static Scanner sc=new Scanner(System.in);
    private static int input() {
        System.out.println("Please select the coffee type: \n" +
                "1. Espresso\n" +
                "2. Latte\n" +
                "3. Cappuccino\n" +
                "4. Stop\n");
        return sc.nextInt();
    }

    public void takeCoffeeByUser(){

        int option=UserService.input();
        while(true){
            if(option==1){
                EspressoCoffee espressoCoffee=new EspressoCoffee();
                espressoCoffee.coffeeType();
                option=UserService.input();
            }
            else if (option==2) {
                LatteCoffee latteCoffee=new LatteCoffee();
                latteCoffee.coffeeType();

                option=UserService.input();
            }
            else if (option==3) {
                CappuccinoCoffee cappuccinoCoffee=new CappuccinoCoffee();
                cappuccinoCoffee.coffeeType();

                option=UserService.input();
            }
            else if (option==4){
                System.out.println("Please enter pin to stop: ");
                int pin=sc.nextInt();
                if (pin==55555){
                    System.out.println("Thank you for using Coffee machine service......");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter correct pin !!!!");
                    option=UserService.input();
                }
            }
            else {
                System.out.println("Please enter correct options!!!");
                option=UserService.input();
            }
        }
    }
}
