package ru.job4j.collection.list;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String element = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        if (index < list.size()) {
            list.set(index, element);
        }
        return list;
    }
}
