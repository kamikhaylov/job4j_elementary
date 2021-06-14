package ru.job4j.syntax.math;

import static ru.job4j.syntax.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divAndDif(double first, double second) {
        return div(first, second) + diff(first, second);
    }

    public static double summMath(double first, double second) {
        return sumAndMultiply(first, second) + divAndDif(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + summMath(10, 20));
    }
}