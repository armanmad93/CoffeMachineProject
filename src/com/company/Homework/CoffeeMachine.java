package com.company.Homework;

import com.company.Homework.Objects.Coffee;
import com.company.Homework.Objects.Tea;

public class CoffeeMachine {

    public void makeDrink(Command command) {

        if (command.getDrinkType().equals("T")) {
            Tea tea = new Tea();
            tea.setDrinkType(command.getDrinkType());
            tea.setSugarCount(command.getSugarCount());
            System.out.println("Start to prepare Tea.");
            System.out.println("Type: " + tea.getDrinkType() + " sugar count: " + tea.getSugarCount());
        }

        if (command.getDrinkType().equals("C")) {
            Coffee coffee = new Coffee();
            coffee.setDrinkType(command.getDrinkType());
            coffee.setSugarCount(command.getSugarCount());
            System.out.println("Start to prepare Coffee.");
            System.out.println("Type: " + coffee.getDrinkType() + " sugar count: " + coffee.getSugarCount());
        }

    }

}
