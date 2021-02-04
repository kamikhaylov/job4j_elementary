package ru.job4j.collection.map;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String string : strings) {
            map.computeIfPresent(string, (key, value) -> true);
            map.putIfAbsent(string, false);
        }
        return map;
    }
}