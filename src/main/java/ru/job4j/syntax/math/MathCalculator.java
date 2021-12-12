package ru.job4j.syntax.math;

import static ru.job4j.syntax.math.MathFunction.*;

public class MathCalculator {
    private static int x = 5;

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divAndDif(double first, double second) {
        return div(first, second) + diff(first, second);
    }

    public static double summMath(double first, double second) {
        return sumAndMultiply(first, second) + divAndDif(first, second);
    }

    public static int sum1(int a, int b) {
        return a + b;
    }

    public static int multiply1(int a, int b) {
        return a * b;
    }


    public static int minus(int y) {
        return x - y;
    }

    public double divide(int y) {
        return y / x;
    }

    public double sumAllOperation(int a, int b, int y) {
        return sum1(a, b) + multiply1(a, b) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + summMath(10, 20));
        System.out.println(minus(2));
        MathCalculator calculator = new MathCalculator();
        System.out.println(calculator.divide(10));
        System.out.println(calculator.sumAllOperation(10, 10, 10));
    }
}