package ru.job4j.collection.map;

public class Article {
    public static boolean generateBy(String origin, String line) {
        for (String s : line.split(" ")) {
            if (!origin.contains(s)) {
                return false;
            }
        }
        return true;
    }
}