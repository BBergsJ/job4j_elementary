package ru.job4j.ex;

import java.lang.reflect.Array;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        // for-each
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                return i;
            }
        }

        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found.");
        }

        return rsl;
    }

    public static void main(String[] args) {
        String[] val = new String[] {"key", "value", "test"};
        String key = "test";
        try {
            indexOf(val, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
