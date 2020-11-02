package ru.job4j.calculator.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = sqrt(pow((x2 - x1), 2) +  pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(1, 2, 2, 0);
        double result2 = Point.distance(2, 4, 2, 8);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (1, 2) to (2, 0) " + result1);
        System.out.println("result (2, 4) to (2, 8) " + result2);
    }
}
