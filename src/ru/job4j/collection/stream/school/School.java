package ru.job4j.collection.stream.school;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}

class FilterA10 implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        return student.getScore() >= 70
                && student.getScore() <= 100;
    }
}

class FilterB10 implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        return student.getScore() >= 50
                && student.getScore() < 70;
    }
}

class FilterV10 implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        return student.getScore() >= 0
                && student.getScore() < 50;
    }
}
