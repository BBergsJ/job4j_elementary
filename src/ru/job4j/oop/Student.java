package ru.job4j.oop;

public class Student {
    public void music(String lyrics) {
//        System.out.println("Tra tra tra");
        System.out.println("I can sing a song: " + lyrics);
    }
    public void song() {
        System.out.println("I believe i can fly");
    }
    public static void main(String[] args) {
        Student petya = new Student();
//        petya.music();
//        petya.music();
//        petya.music();
//        petya.song();
//        petya.song();
//        petya.song();
        String song = "I believe i can fly";
        petya.music(song);
    }
}
