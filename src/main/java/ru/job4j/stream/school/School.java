package ru.job4j.stream.school;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public Map<String, Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .distinct()
                .collect(Collectors.toMap(
                        e -> e.getSurname(),
                        e -> e
                ));
    }
}