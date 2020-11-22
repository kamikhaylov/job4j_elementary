package ru.job4j.oop.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenFactEc() {
        Fact fact = new Fact();
        int result = fact.calc(-1);
    }
}