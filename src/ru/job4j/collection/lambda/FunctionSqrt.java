package ru.job4j.collection.lambda;

import java.util.function.Function;

public class FunctionSqrt {

    public static double calculate(double x) {
        return calculate(aDouble -> Math.sqrt(aDouble), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}