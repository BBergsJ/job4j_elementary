package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
//        HashSet<String> originSet = new HashSet<>(Arrays.asList(origin.split("[ ,!.;:]")));
//        HashSet<String> lineSet = new HashSet<>(Arrays.asList(line.split("[ ,!.;:]")));
//        boolean result = true;
//
//        for (String s : lineSet) {
//            if (!originSet.contains(s)) {
//                result = false;
//                break;
//            }
//        }
//
//        return result;

        HashSet<String> originSet = new HashSet<>(Arrays.asList(origin.split(" ")));
        String[] lineArray = line.split(" ");
        HashSet<String> lineSet = new HashSet<>();
        boolean result = true;

        for (String s : originSet) {
            char[] charS = s.toCharArray();
            if (!Character.isLetter(charS[charS.length - 1])) {
                charS = Arrays.copyOf(charS, charS.length - 1);
                s = String.valueOf(charS);
            }
            lineSet.add(s);
        }

        for (String c : lineArray) {
            if (!lineSet.contains(c)) {
                result = false;
                break;
            }
        }

        return result;
    }
}