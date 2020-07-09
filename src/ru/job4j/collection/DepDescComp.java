package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        String[] oOne = o1.split("/");
        String[] oTwo = o2.split("/");
        int minLenght = Math.min(oOne.length, oTwo.length);
        int result = 0;

        for (int i = 0; i < minLenght; i++) {
            result = oOne[i].compareTo(oTwo[i]);
            if (result != 0) {
                break;
            }
        }

        if (oOne.length != oTwo.length) {
            result = Integer.compare(oOne.length, oTwo.length);
        }

        return result;
    }
}
