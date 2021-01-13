package ru.job4j.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public List<Integer> collect(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}
