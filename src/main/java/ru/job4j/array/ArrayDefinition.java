package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[5];
        names[0] = "Petr Arsentev";
        names[1] = "Andrei Hincu";
        names[2] = "Korobeinikov Stas";
        names[3] = "Rail Shamsemuhametov";
        names[4] = "Sergey Mayer";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        System.out.println(names.length);
    }
}