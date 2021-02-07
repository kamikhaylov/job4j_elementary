package ru.job4j.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        Set<String> wordsString = new HashSet<>(Arrays.asList(s.split(" ")));
        for (String wordString : wordsString) {
            for (String word : words) {
                if (wordString.equals(word)) {
                    return "Выберите другую статью...";
                }
            }
        }
        return "Вы сделали правильный выбор!";
    }
}