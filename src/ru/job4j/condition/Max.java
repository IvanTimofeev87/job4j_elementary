package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int biggestNumber = Max.max(6, 2);
        System.out.println(" First number 6, second number 2. Biggest number is " + biggestNumber);
    }
}
