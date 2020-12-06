package com.company.Homework;

public class Command {

    private String drinkType;
    private String sugarCount;

    public void convertStringToArray(String string) {
        String[] array = string.split(":");
        drinkType = array[0];
        sugarCount = array[1];
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public String getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(String sugarCount) {
        this.sugarCount = sugarCount;
    }
}
