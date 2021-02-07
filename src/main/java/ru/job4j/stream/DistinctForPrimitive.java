package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        return IntStream.of(data)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }
}