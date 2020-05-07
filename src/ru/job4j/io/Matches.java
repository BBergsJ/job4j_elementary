package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;
        boolean turnOne = true;
        System.out.println("Игра \"Спички\"");
        while (matches > 0) {
            if (turnOne) {
                System.out.println("Игрок 1, заберите от 1 до 3 спичек: ");
                int playerOne = Integer.valueOf(scanner.nextLine());
                matches -= playerOne;
                turnOne = false;
            } else {
                System.out.println("Игрок 2, заберите от 1 до 3 спичек: ");
                int playerTwo = Integer.valueOf(scanner.nextLine());
                matches -= playerTwo;
                turnOne = true;
            }
            System.out.println("Осталось " + matches + " спичек.");
        }
        System.out.println("Спички кончились.");
        if (turnOne) {
            System.out.println("Победил Игрок 1!" + System.lineSeparator() + "Конец игры.");
        } else {
            System.out.println("Победил Игрок 2!" + System.lineSeparator() + "Конец игры.");
        }

    }
}
