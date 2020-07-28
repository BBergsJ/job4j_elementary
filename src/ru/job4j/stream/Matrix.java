package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public List<Integer> collectToFlatMap(Integer[][] matrixInteger) {
        List<Integer> result = Stream.of(matrixInteger).flatMap(Stream::of).collect(Collectors.toList());
        return result;
    }
}
