package ru.job4j.inheritance;

public class Tiger extends Predator {

    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    public Tiger(String name) {
        super(name);
        System.out.println("Tiger " + name);
    }

    public static void main(String[] args) {
        Tiger tig = new Tiger();
        Tiger tog = new Tiger("Tigra");
    }
}

