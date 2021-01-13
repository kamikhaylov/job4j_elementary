package ru.job4j.collection.stream.school;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    private List<Student> students = new ArrayList<>();

    @Before
    public void setUp() {
        students.add(new Student(10, "Surname1"));
        students.add(new Student(20, "Surname2"));
        students.add(new Student(30, "Surname3"));
        students.add(new Student(40, "Surname4"));
        students.add(new Student(50, "Surname5"));
        students.add(new Student(60, "Surname6"));
        students.add(new Student(70, "Surname7"));
        students.add(new Student(80, "Surname8"));
        students.add(new Student(90, "Surname9"));
    }

    @Test
    public void whenCollectClassA() {
        School sc = new School();
        Predicate<Student> pr = student -> student.getScore() >= 70
                && student.getScore() <= 100;
        Map<String, Student> rsl = sc.collect(students, pr);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname7", new Student(70, "Surname7"));
        expected.put("Surname8", new Student(80, "Surname8"));
        expected.put("Surname9", new Student(90, "Surname9"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassB() {
        School sc = new School();
        Predicate<Student> pr = student -> student.getScore() >= 50
                && student.getScore() < 70;
        Map<String, Student> rsl = sc.collect(students, pr);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname5", new Student(50, "Surname5"));
        expected.put("Surname6", new Student(60, "Surname6"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassC() {
        School sc = new School();
        Predicate<Student> pr = student -> student.getScore() >= 0
                && student.getScore() < 50;
        Map<String, Student> rsl = sc.collect(students, pr);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname1", new Student(10, "Surname1"));
        expected.put("Surname2", new Student(20, "Surname2"));
        expected.put("Surname3", new Student(30, "Surname3"));
        expected.put("Surname4", new Student(40, "Surname4"));
        assertThat(rsl, is(expected));
    }
}