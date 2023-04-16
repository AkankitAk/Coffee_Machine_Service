package inputOutput;

import service.UserService;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

public class IOForUser {
    static Scanner sc=new Scanner(System.in);
    static void welcomeMode(){
        LocalTime time = LocalTime.now();
        System.out.println();
        if (time.isBefore(LocalTime.NOON)) {
            System.out.println("Good morning! welcome to coffee machine service");
        } else if (time.isBefore(LocalTime.of(17, 0))) {
            System.out.println("Good afternoon! welcome to coffee machine service");
        } else if (time.isBefore(LocalTime.of(20, 0))) {
            System.out.println("Good evening! welcome to coffee machine service");
        }
        System.out.println();
    }
    static int inputFunction(){
        System.out.println("Please select the given option: \n" +
                "1. Fill ingredient\n" +
                "2. See all ingredient\n" +
                "3. Ready to use");
        return sc.nextInt();

    }

    public void selectOption(){
        IOForMaintenance inputOutputFunctions=new IOForMaintenance();
        IOForUser.welcomeMode();
        int option= IOForUser.inputFunction();
        while (true){
            if (option==1){
                inputOutputFunctions.maintainerFillIngredients();
                int option1= IOForUser.inputFunction();
                option=option1;
            }
            else if (option==2){
                inputOutputFunctions.showAllIngredients();
                System.out.println();
                int option1= IOForUser.inputFunction();
                option=option1;
            }
            else if (option==3) {
                UserService userService=new UserService();
                userService.takeCoffeeByUser();
            }
            else if (option==4){
                break;
            }
        }
    }
}
