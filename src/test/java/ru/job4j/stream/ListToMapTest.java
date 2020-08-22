package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ListToMapTest {

    @Test
    public void whenDuplicate() {
        List<Student> students = List.of(new Student("Vasya", 50)
                , new Student("Vasya", 50)
                , new Student("Igor", 30)
        );
        Map<String, Student> expected = Map.of("Vasya", new Student("Vasya",50 )
                , "Igor", new Student("Igor", 30)
        );
        ListToMap listToMap = new ListToMap();
        assertThat(listToMap.collect(students), is(expected));
    }
}