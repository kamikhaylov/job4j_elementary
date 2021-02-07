package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StringMapToList {
    public static List<String> map(List<String> names) {
        return names.stream()
                .map(name -> name + ".java")
                .collect(Collectors.toList());
    }
}
