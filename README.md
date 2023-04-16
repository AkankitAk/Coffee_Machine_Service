# Coffee Machine Simulation
## Overview
The coffee machine simulation is a program that simulates a coffee vending machine. It allows users to buy various types of coffee, fill the machine with ingredients, take the money from the machine, show the current inventory of ingredients, and exit the simulation.

The simulation is written in Python and uses a command-line interface to interact with users.

## Buying Coffee
To buy coffee, the user selects the "buy" option from the main menu and chooses the type of coffee they want to buy. Each coffee has a unique price and requires a specific amount of water, milk, and coffee beans. The machine will only dispense the coffee if it has sufficient ingredients to make the selected coffee. If there are not enough ingredients, the machine will display an error message.

After dispensing the coffee, the money in the machine's money box will be updated, and the remaining ingredients will be adjusted accordingly.

## Filling the Machine with Ingredients
To fill the machine with ingredients, the user selects the "fill" option from the main menu and adds the required amount of water, milk, and coffee beans to the machine. The machine can hold an infinite amount of ingredients, but initially contains nothing.

## Taking the Money from the Machine
To take the money from the machine, the user selects the "take" option from the main menu. This will empty the money box and start afresh.

## Showing the Current Inventory of Ingredients
To show the current inventory of ingredients, the user selects the "show" option from the main menu. This will display the current inventory of ingredients in the machine.

## Exiting the Simulation
To exit the simulation, the user selects the "exit" option from the main menu.

## Analytics Option
The coffee machine simulation also includes an "analytics" option that provides detailed information about the number of each type of coffee sold, the amount of revenue generated from coffee sales, and the amount of ingredients consumed. This feature could be beneficial in monitoring the performance of the coffee machine and improving its efficiency.

To access the analytics option, the user selects the "analytics" option from the main menu. The simulation will display the following information:

* Number of each type of coffee sold
* Total revenue generated from coffee sales
* Amount of water, milk, and coffee beans consumed
