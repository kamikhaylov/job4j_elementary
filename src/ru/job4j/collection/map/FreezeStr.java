package ru.job4j.collection.map;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> leftMap = createCharMap(left);
        Map<Character, Integer> rightMap = createCharMap(right);
        return leftMap.equals(rightMap);
    }

    public static Map<Character, Integer> createCharMap(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        return charMap;
    }
}
