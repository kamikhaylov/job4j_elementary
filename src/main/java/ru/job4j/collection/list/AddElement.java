package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

public class AddElement {
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        check.add(str);
        return check.size() > list.size();
    }
}