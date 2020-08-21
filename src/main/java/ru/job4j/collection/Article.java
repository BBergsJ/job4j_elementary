package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        HashSet<String> originSet = new HashSet<>(Arrays.asList(origin.split("[ ,!.;:]")));
        HashSet<String> lineSet = new HashSet<>(Arrays.asList(line.split("[ ,!.;:]")));
        boolean result = true;

        for (String s : lineSet) {
            if (!originSet.contains(s)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
