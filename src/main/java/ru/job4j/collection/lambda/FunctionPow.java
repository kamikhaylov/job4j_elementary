package ru.job4j.collection.lambda;

import java.util.function.Function;

public class FunctionPow {

    public static double calculate(double x) {
        return calculate(aDouble -> Math.pow(aDouble, 2), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}