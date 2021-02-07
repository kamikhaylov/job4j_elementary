package ru.job4j.oop.vehicle;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летает");
    }

    @Override
    public void speed() {
        System.out.println("Скорость 350 км/ч");
    }

    @Override
    public String toString() {
        return "Airplane";
    }
}
