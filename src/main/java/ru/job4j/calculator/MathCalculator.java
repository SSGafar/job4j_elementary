package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double differenceAnDivision(double first, double second) {
        return difference(first, second) / division(first, second);

    }

    public static double sumFourOperations(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAnDivision(35, 10));
        System.out.println("Результат расчета равен: " + sumFourOperations(10, 20));
    }
}

