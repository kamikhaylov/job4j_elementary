package ru.job4j.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> isogram = new HashSet<>(Arrays.asList(s.split("")));
        return isogram.size() == s.length() ? true : false;
    }
}
