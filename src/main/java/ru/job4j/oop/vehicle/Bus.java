package ru.job4j.oop.vehicle;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус передвигается по дорогам");
    }

    @Override
    public void speed() {
        System.out.println("Скорость 90 км/ч");
    }

    @Override
    public String toString() {
        return "Bus";
    }
}
