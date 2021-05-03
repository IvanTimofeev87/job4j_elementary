package ru.job4j.calculator;

public class Calculator {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        Calculator.hello(name);
        Calculator.hello(name);
        Calculator.hello(name);
        Calculator.hello(name);
    }
}
