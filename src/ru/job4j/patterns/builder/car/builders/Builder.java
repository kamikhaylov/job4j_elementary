package ru.job4j.patterns.builder.car.builders;

import ru.job4j.patterns.builder.car.cars.CarType;
import ru.job4j.patterns.builder.car.components.Engine;
import ru.job4j.patterns.builder.car.components.GPSNavigator;
import ru.job4j.patterns.builder.car.components.Transmission;
import ru.job4j.patterns.builder.car.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
