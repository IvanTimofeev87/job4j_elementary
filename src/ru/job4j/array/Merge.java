package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int index = 0;

        for (int number : left) {
            rsl[index++] = number;
        }

        for (int number : right) {
            rsl[index++] = number;
        }

        return rsl;
    }
}
