package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int minLenght = Math.min(left.length(), right.length());
        int result = 0;

            for (int i = 0; i < minLenght; i++) {
                result = Character.compare(left.charAt(i), right.charAt(i));
                if (result != 0) {
                    return result;
                }
            }
        if (left.length() != right.length()) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}