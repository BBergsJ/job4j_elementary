package ru.job4j.oop.kolobok;

public class BallStory {
    public static void main(String[] args) {

        Ball kolobok = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(kolobok);
        kolobok.runFromHare(hare);

        wolf.tryEat(kolobok);
        kolobok.runFromWolf(wolf);

        fox.tryEat(kolobok);
        kolobok.runFromFox(fox);
    }
}
