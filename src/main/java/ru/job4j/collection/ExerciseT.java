package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class ExerciseT {
    public static void main(String[] args) {

        String[] names = {
                "Ivan"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthCmp);
    }
}
