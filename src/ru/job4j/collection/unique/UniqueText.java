package ru.job4j.collection.unique;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String o : origin) {
            check.add(o);
        }
        for (String t : text) {
            if (!check.contains(t)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}