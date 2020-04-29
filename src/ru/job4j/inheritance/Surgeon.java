package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int successOperations;

    public String getName() {
        return super.getName();
    }

    public void givesAdvice() {
        super.givesAdvice();
    }

    public Surgeon(int successOperations) {
        this.successOperations = successOperations;
    }

    public void makeOperation() {

    }
}
