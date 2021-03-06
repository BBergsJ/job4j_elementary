package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public Map<String, Student> collect(List<Student> students) {
        Map<String, Student> result = students.stream()
                .collect(Collectors.toMap(Student::getSurname, student -> student, (s, a) -> s));
        return result;
    }
}