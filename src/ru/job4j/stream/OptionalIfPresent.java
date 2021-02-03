package ru.job4j.stream;

import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        max(data).ifPresent(x -> System.out.println("Max: " + x));
    }

    private static Optional<Integer> max(int[] data) {
        if (data.length != 0) {
            int rsl = data[0];
            for (int i = 1; i < data.length; i++) {
                if (rsl < data[i]) {
                    rsl = data[i];
                }
            }
            return Optional.of(rsl);
        }
        return Optional.empty();
    }
}