package ru.job4j.strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder(System.lineSeparator());
        pic.append("    +    ");
        pic.append("  +    +  ");
        pic.append(" +      + ");
        pic.append("++++++++++");
        return pic.toString();
    }
}
