package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax6To3Then6() {
        int result = Max.max(6, 3);
        assertThat(result, is(6));
    }

    @Test
    public void when11Equals11Then11() {
        int result = Max.max(11, 11);
        assertThat(result, is(11));
    }
}