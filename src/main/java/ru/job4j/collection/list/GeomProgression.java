package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int rsl = 0;
        List<Integer> numbers = new ArrayList<>(count);
        if (denominator > 0) {
            numbers.add(1);
            numbers.add(first * denominator);
            rsl = numbers.get(0) + numbers.get(1);
            for (int i = 2; i < count; i++) {
                numbers.add(numbers.get(i - 1) * denominator);
                rsl += numbers.get(i);
            }
        } else {
            rsl = 0;
        }
        return rsl;
    }
}