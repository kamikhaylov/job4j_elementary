package ru.job4j.collection.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        int index = list.indexOf(str);
        int indexLast = list.lastIndexOf(str);
        if (index == -1) {
            return false;
        }
        return index == indexLast;
    }
}