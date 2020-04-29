package ru.job4j.inheritance;

public class Doctor extends Profession {
    private int experience;
    private boolean paediatrist;


    public void givesAdvice() {

    }

    public void expert(int experience) {
        this.experience = experience;
    }
}