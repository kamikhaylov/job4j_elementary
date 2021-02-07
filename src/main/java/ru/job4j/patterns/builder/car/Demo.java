package ru.job4j.patterns.builder.car;

import ru.job4j.patterns.builder.car.builders.CarBuilder;
import ru.job4j.patterns.builder.car.builders.CarManualBuilder;
import ru.job4j.patterns.builder.car.cars.Car;
import ru.job4j.patterns.builder.car.cars.Manual;
import ru.job4j.patterns.builder.car.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}