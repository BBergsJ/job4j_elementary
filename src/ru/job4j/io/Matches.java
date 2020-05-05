package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;
        System.out.println("Игра \"Спички\"");
        while (matches > 0) {
            System.out.println("Игрок 1, заберите от 1 до 3 спичек: ");
            int playerOne = Integer.valueOf(scanner.nextLine());
            matches -= playerOne;
            if (matches <= 0) {
                System.out.println("Победил Игрок 2.");
            }
            System.out.println("Осталось " + matches + " спичек.");
            System.out.println("Игрок 2, заберите от 1 до 3 спичек: ");
            int playerTwo = Integer.valueOf(scanner.nextLine());
            matches -= playerTwo;
            if (matches <= 0) {
                System.out.println("Победил Игрок 1.");
            }
            System.out.println("Осталось " + matches + " спичек.");
        }
        System.out.println("Спички кончились, конец игры.");
    }
}
