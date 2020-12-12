package ru.job4j.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<String> letter = new HashSet<>(Arrays.asList(s.split("")));
        letter.remove(" ");
        return letter.size() == 26 ? true : false;
    }
}
