package ru.job4j.syntax.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 200;
        expected = 3;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("200 rubles are 3 dollar. Test result : " + passed);
    }
}