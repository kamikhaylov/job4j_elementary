package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Petr");
        namesList.add("Ivan");
        namesList.add("Stepan");
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}