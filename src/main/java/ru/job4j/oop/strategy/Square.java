package ru.job4j.oop.strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    "_______" + ln
                + "|     | " + ln
                + "|_____|" + ln;
    }
}