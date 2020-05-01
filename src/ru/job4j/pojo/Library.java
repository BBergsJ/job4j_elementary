package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book abc = new Book("Azbuka", 33);
        Book kol = new Book("Kolobok", 10);
        Book red = new Book("Krasnaya Shapka", 15);
        Book clean = new Book("Clean Code", 0);

        Book[] booki = new Book[] {abc, kol, red, clean};

        for (int i = 0; i < booki.length; i++) {
            Book bo = booki[i];
            System.out.println(bo.getTitle() + " - " + bo.getPages());
        }

        Book temp = booki[0];
        booki[0] = booki[3];
        booki[3] = temp;

        for (int i = 0; i < booki.length; i++) {
            Book bo = booki[i];
            System.out.println(bo.getTitle() + " - " + bo.getPages());
        }

        for (int i = 0; i < booki.length; i++) {
            Book bo = booki[i];
            if (bo.getTitle().equals("Clean Code")) {
                System.out.println(bo.getTitle() + " - " + bo.getPages());
            }
        }
    }
}
