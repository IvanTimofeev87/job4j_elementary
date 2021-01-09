package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        return (Math.abs(x1 - x2) == Math.abs(y1 - y2)) ? Math.abs(x2 - x1) : 0;
    }

    public static void main(String[] args) {
        int cells = way(3, 3,  0, 0);
        System.out.println("Количество клеток равно: " + cells);
    }
}
