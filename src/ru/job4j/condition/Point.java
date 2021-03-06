package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double subX = x2 - x1;
        double subY = y2 - y1;
        double rsl = Math.sqrt(Math.pow(subX, 2) + Math.pow(subY, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 3, 7, 8);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(2, 4, 4, 8);
        System.out.println("result (2, 4) to (4, 8) " + result);
        result = Point.distance(3, 6, 6, 9);
        System.out.println("result (3, 6) to (6, 9) " + result);
    }
}
