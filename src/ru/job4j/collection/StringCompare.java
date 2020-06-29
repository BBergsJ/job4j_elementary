package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int minLenght = Math.min(left.length(), right.length());
        int result = 0;
//        int counter = 0;
//            while (counter < minLenght) {
//                if (left.charAt(counter) != right.charAt(counter)) {
//                    return -1;
//                }
//                counter++;
//            }
        for (int i = 0; i < minLenght; i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                return Integer.compare(left.length(), right.length());
            }
        }
        return result;
    }
}