package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenMinusThanError() {
        Fact.calc(-1);
    }
}