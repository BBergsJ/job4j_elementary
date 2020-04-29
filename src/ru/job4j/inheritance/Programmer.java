package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String technologies;

    public void tech(String technologies) {
        this.technologies = technologies;
    }

    public boolean free() {
        return super.free();
    }

    public String getSurname() {
        return super.getSurname();
    }

    public void write() {

    }


}