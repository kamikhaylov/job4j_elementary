package ru.job4j.oop.vehicle;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд передвигается по рельсам");
    }

    @Override
    public void speed() {
        System.out.println("Скорость 60 км/ч");
    }

    @Override
    public String toString() {
        return "Train";
    }
}
