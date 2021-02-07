package ru.job4j.stream;

import java.util.List;
import java.util.Optional;

public class OptionalOfAndEmpty {
    public static Optional<String> findValue(List<String> strings, String value) {
        return strings.stream()
                .filter(stringElement -> stringElement.equals(value))
                .findFirst();
    }
}