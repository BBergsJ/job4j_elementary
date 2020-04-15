package ru.job4j.converter;

/**
 * Converter.
 *
 * @author Dmitry Emelyanov (goldlike888@gmail.com)
 */
public class Converter {
    /**
     *Method rubleToEuro.
     * @param value Ruble to Euro.
     * @return Euros.
     */
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Method rubleToDollar.
     * @param value Ruble to Dollar.
     * @return Dollars.
     */
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 240;
        expected = 4;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("240 rubles are 4. Test result : " + passed);
    }
}
