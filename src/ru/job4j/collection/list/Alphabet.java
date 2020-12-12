package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        Collections.sort(list);
        StringBuilder result = new StringBuilder();
        for (String l : list) {
            result.append(l);
        }
        return result.toString();
    }
}