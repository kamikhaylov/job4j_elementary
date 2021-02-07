package ru.job4j.collection.list;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        if (list.size() == 0) {
            return "";
        }
        return list.get(0);
    }
}
