package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 8, -9, 4, -6, 3, -1);
        List<Integer> rsl = numbers.stream().filter(
                Integer -> Integer > 0
        ).collect(Collectors.toList());
        rsl.forEach(System.out::println);
    }
}
