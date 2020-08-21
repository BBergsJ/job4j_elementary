package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;
        boolean turnOne = true;
        System.out.println("Игра \"Спички\"");
        while (matches > 0) {
            System.out.println(String.format("%s, заберите от 1 до 3 спичек: ", turnOne ? "Игрок 1" : "Игрок 2"));
            int i = Integer.valueOf(scanner.nextLine());
            turnOne = !turnOne;
            matches -= i;
            System.out.println("Осталось " + matches + " спичек.");
        }
        System.out.println(String.format("Спички кончились. Победил %s!"
                + System.lineSeparator() + "Конец игры.", turnOne ? "Игрок 1" : "Игрок 2"));
    }
}
