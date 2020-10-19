package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> leftMap = new HashMap<>();
        Map<Character, Integer> rightMap = new HashMap<>();

        return check(leftMap, left).equals(check(rightMap, right));
    }

    public static Map<Character, Integer> check(Map map, String s) {
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, (int) map.get(c) + 1);
            }
        }
        return map;
    }
}