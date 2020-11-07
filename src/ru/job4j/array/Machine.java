package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;

        int surrender = money - price;
        for (int index = 0; index < coins.length; index++) {
            while (surrender - coins[index] >= 0) {
                surrender -= coins[index];
                rsl[size] = coins[index];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}