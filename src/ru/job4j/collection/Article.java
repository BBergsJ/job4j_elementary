package ru.job4j.collection;

import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        HashSet<String> originSet = new HashSet<>();
        HashSet<String> lineSet = new HashSet<>();
        boolean result = true;

        for (String s : origin.split(" |,|!|\\.")) {
            originSet.add(s);
        }
        for (String s : line.split(" |,|!|\\.|;|:")) {
            lineSet.add(s);
        }

        for (String s : lineSet) {
            if (!originSet.contains(s)) {
                result = false;
                break;
            }
        }

        return result;
    }
}
