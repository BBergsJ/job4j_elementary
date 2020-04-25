package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String error = "Неизвестное слово. " + eng;
        return error;
    }
    public static void main(String[] args) {
        DummyDic dum = new DummyDic();
        System.out.println(dum.engToRus("dummy"));
    }
}
