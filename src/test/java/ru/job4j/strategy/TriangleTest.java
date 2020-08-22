package ru.job4j.strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenDrawThenTriangle() {
        assertThat(new Triangle().draw(), is(new StringBuilder(System.lineSeparator())
                .append("    +    ")
                .append("  +    +  ")
                .append(" +      + ")
                .append("++++++++++")
                .toString()));
    }
}