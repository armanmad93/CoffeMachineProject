package com.company.Homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what you wanna drink?");
        String input = scanner.nextLine();

        Command command = new Command();
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        command.convertStringToArray(input);
        coffeeMachine.makeDrink(command);

    }

}
