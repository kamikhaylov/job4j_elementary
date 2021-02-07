package ru.job4j.oop.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[] {airplane, train, bus};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.move();
            vehicle.speed();
        }
    }
}