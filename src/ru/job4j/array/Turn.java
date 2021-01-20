package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp1 = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp1;
        for (int index = 1; index < array.length - 1; index++) {
            if (index >= array.length - index - 1) {
                    break;
            } else {
                int temp2 = array[index];
                array[index] = array[array.length - index - 1];
                array[array.length - index - 1] = temp2;
            }
        }
        return array;
    }
}
