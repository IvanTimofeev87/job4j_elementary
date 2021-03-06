package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int totalChange = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (totalChange - coins[i] >= 0) {
                rsl[size++] = coins[i];
                totalChange = totalChange - coins[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
