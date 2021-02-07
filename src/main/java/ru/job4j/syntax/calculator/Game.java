package ru.job4j.syntax.calculator;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        double result = 0;
        if (percent * prize > pay) {
            result =  percent * prize - pay;
        } else if ((percent * prize - pay) <= 0) {
            result = 0;
        }
        return (int) result;
    }
}
