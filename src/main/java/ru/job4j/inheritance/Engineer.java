package ru.job4j.inheritance;

public class Engineer extends Profession {

    private boolean freelance;

    public String getEducation() {
        return super.getEducation();
    }

    public void giveTask() {

    }

    public boolean free() {
        return freelance;
    }

}
