package ru.job4j.collection.map;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> chars = new TreeMap<>();
        char rsl = ' ';
        int repeat = 0;
        String formatStr = str.replaceAll(" ", "").toLowerCase();
        for (char s : formatStr.toCharArray()) {
            if (!chars.containsKey(s)) {
                chars.putIfAbsent(s, 1);
            } else {
                chars.computeIfPresent(s, (key, value) -> value + 1);
            }
        }
        for (Character c : chars.keySet()) {
            if (chars.get(c) > repeat) {
                repeat = chars.get(c);
                rsl = c;
            }
        }
        return rsl;
    }
}