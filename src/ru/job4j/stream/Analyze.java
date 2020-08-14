package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(x -> x.getSubjects().stream())
                .mapToDouble(Subject::getScore)
                .average()
                .getAsDouble();
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(x -> new Tuple(
                        x.getName(),
                        x.getSubjects().stream().mapToDouble(Subject::getScore).average().getAsDouble()))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(x -> x.getSubjects().stream())
                .collect(Collectors.toMap(
                        Subject::getName,
                        Subject::getScore,
                        (a, b) -> (a + b) / 2))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue()))
                .sorted(Comparator.comparing(Tuple::hashCode).reversed())
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(x -> new Tuple(
                        x.getName(),
                        x.getSubjects()
                                .stream()
                                .mapToDouble(Subject::getScore)
                                .reduce(Double::sum)
                                .getAsDouble()))
                .max(Comparator.comparing(Tuple::getScore))
                .get();
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}