package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenIntegerMatrix() {
        Integer[][] integers = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5 ,6 ,7 ,8);
        Matrix matrix = new Matrix();
        assertThat(matrix.collectToFlatMap(integers), is(expected));
    }
}