package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void whenIQ70To100() {
        School school = new School();
        Predicate<Student> predicate = x -> x.getScore() > 70 && x.getScore() <= 100;
        List<Student> testArray = Arrays.asList(
                new Student("Vova", 66),
                new Student("Igor", 43),
                new Student("Alex", 98));
        List<Student> expected = Arrays.asList(testArray.get(2));
        assertThat(school.collect(testArray, predicate), is(expected));
    }

    @Test
    public void whenIQ50To70() {
        School school = new School();
        Predicate<Student> predicate = x -> x.getScore() > 50 && x.getScore() <= 70;
        List<Student> testArray = Arrays.asList(
                new Student("Vova", 66),
                new Student("Igor", 43),
                new Student("Alex", 98));
        List<Student> expected = Arrays.asList(testArray.get(0));
        assertThat(school.collect(testArray, predicate), is(expected));
    }

    @Test
    public void whenIQ0To50() {
        School school = new School();
        Predicate<Student> predicate = x -> x.getScore() >= 0 && x.getScore() <= 50;
        List<Student> testArray = Arrays.asList(
                new Student("Vova", 66),
                new Student("Igor", 43),
                new Student("Alex", 98));
        List<Student> expected = Arrays.asList(testArray.get(1));
        assertThat(school.collect(testArray, predicate), is(expected));
    }
}