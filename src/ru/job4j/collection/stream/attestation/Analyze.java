package ru.job4j.collection.stream.attestation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(s -> s.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(p -> {
                    double score = p.getSubjects().stream()
                            .mapToInt(Subject::getScore)
                            .average()
                            .orElse(0D);
                    return new Tuple(p.getName(), score);
                })
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream()
                .map(p -> new Tuple(p.getKey(), p.getValue()))
                .sorted( (o1, o2) -> -o1.getName().compareTo(o2.getName()) )
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(p -> {
                    double score = p.getSubjects().stream()
                            .mapToInt(Subject::getScore)
                            .sum();
                    return new Tuple(p.getName(), score);
                })
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .max(Comparator.comparingDouble(Tuple::getScore))
                .orElse(null);
    }
}