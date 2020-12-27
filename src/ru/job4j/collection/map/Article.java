package ru.job4j.collection.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        Set<String> setOrigin = new HashSet<>(Arrays.asList(origin.split("[^a-zA-Zа-яА-Я]")));
        Set<String> setLine = new HashSet<>(Arrays.asList(line.split("[^a-zA-Zа-яА-Я]")));
        int sizeOrirgin = setOrigin.size();
        for (String s : setLine) {
            setOrigin.add(s);
        }
        return sizeOrirgin == setOrigin.size();
    }
}