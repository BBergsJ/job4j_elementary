package ru.job4j.inheritance;

public class Animal {

    private String name;

    public Animal() {
        super();
        System.out.println("Animal");
    }

    public Animal(String name) {
        super();
        this.name = name;
        System.out.println("Animal " + name);
    }
}
