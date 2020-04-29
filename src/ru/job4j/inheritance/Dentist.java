package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String additionalProfession;

    public void givesAdvice() {
        super.givesAdvice();
    }

    public String abilities(String additionalProfession) {
        this.additionalProfession = additionalProfession;
        return "Added";
    }

    public String getName() {
        return super.getName();
    }

    public int getBirthday() {
        return super.getBirthday();
    }

    public void treatTeeth() {

    }
}
