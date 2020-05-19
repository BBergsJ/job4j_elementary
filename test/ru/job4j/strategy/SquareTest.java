package ru.job4j.strategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenDrawThenSquare() {
        assertThat(new Square().draw(), is(new StringBuilder(System.lineSeparator())
                .append("++++++++")
                .append("+      +")
                .append("+      +")
                .append("++++++++")
                .toString()));
    }
}