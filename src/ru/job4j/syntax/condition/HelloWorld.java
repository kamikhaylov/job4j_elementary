package ru.job4j.syntax.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        String result = "Operation not support";
        if ((number % 3) == 0) {
            result = "Hello";
        }
        if ((number % 5) == 0) {
            result = "World";
        }
        if (((number % 5) == 0) && (number % 3) == 0) {
            result = "Hello, World!!!";
        }
        return result;
    }
}
