package ru.job4j.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String string : strings) {
            String symbol = string.substring(0, 1);
            rsl.putIfAbsent(symbol, new ArrayList<>());
            rsl.get(symbol).add(string);
        }
        return rsl;
    }
}