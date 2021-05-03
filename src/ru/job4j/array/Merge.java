package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        int rslIndex = 0;
        while (rslIndex < rsl.length) {

            if (indexLeft < left.length && indexRight < right.length) {
                rsl[rslIndex++] = left[indexLeft] < right[indexRight] ? left[indexLeft++] : right[indexRight++];
            } else if (indexLeft < left.length) {
                rsl[rslIndex++] = left[indexLeft++];
            } else if (indexRight < right.length) {
                rsl[rslIndex++] = right[indexRight++];
            }

        }
        return rsl;
    }
}
