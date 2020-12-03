package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int rsl;
        if (first > second) {
            rsl = first > third ? first : third;
        } else {
            rsl = second> third ? second : third;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int biggest = max(8,8,8);
        System.out.println("Самое большое число из трёх: " + biggest);
    }
}
