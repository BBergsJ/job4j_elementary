package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleToDiv(4);
        possibleToDiv(0);
        possibleToDiv(-2);
    }

    public static void possibleToDiv(int number) {
        if (number == 0) {
            System.out.println(number + " - Could not div by 0.");
        }
        if (number < 0) {
            System.out.println(number + " - This is negative numbers");
        }
    }
}
