package ru.job4j.inheritance;

public class Builder extends Engineer {

    private char driverLicense;

    public char typeOfLicense() {
        return driverLicense;
    }

    public void build() {

    }

    public void breaking() {

    }

    public void giveTask() {

    }

    public boolean free() {
        return super.free();
    }

    public String getName() {
        return super.getName();
    }
}
