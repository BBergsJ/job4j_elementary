package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        String[] oOne = o1.split("/");
        String[] oTwo = o2.split("/");

        int result = oTwo[0].compareTo(oOne[0]);

        return result == 0 ? o1.compareTo(o2) : result;
    }
}
