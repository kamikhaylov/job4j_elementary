package ru.job4j.collection.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if(!list.contains(str)) {
            check.add(index, str);
        }
        return check.size() > list.size();
    }
}