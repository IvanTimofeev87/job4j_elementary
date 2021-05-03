package ru.job4j;

import java.util.Scanner;

public class MyTest {
    public static void mult(int a, int n) {
        int numb = a;
        for (int i = 1; i < n; i++) {
            if (i > 0) {
                numb *= a;
            }
        }
        System.out.println(numb);
    }

    public static void main(String[] args) {
        mult(2, 7);
    }
}
