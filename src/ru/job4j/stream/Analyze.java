package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.getSubjects().stream())
                .mapToDouble(Subject::getScore)
                .average()
                .getAsDouble();
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(x -> new Tuple(
                        x.getName(),
                        x.getSubjects().stream().mapToDouble(Subject::getScore).average().getAsDouble()
                )).collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(x -> new Tuple(
                x.getSubjects().,
                x.getSubjects().stream().mapToDouble(Subject::getScore)
        )).collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}