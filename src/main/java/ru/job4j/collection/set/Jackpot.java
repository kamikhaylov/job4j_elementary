package ru.job4j.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> jackpot = new HashSet<>();
        for (int i = 0; i < combination.length; i++) {
            jackpot.add(combination[i]);
        }
        return jackpot.size() == 1 ? true : false;
    }
}
