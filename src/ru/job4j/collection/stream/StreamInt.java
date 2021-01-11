package ru.job4j.collection.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInt {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(1);
        numbers.add(-2);
        numbers.add(2);
        numbers.add(-3);
        numbers.add(3);
        List<Integer> numbersPositive = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        numbersPositive.forEach(System.out::println);
    }
}
