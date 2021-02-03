package ru.job4j.stream;

import java.util.Optional;

public class OptionalGetAndIsPresent {
    public static int get(int[] data, int el) {
        if (indexOf(data, el).equals(Optional.empty())) {
            return -1;
        }
        return indexOf(data, el).get();
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                Optional.of(i).isPresent();
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}