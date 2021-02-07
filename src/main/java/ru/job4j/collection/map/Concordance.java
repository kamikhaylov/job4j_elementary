package ru.job4j.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        s = s.replaceAll("\\s+","");
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            rsl.putIfAbsent(symbol, new ArrayList<>());
            rsl.get(symbol).add(i);
        }
        return rsl;
    }
}