package ru.job4j.oop.poly;

import java.math.BigDecimal;

public interface Transport {
    void go();

    void passengers(int numberOfPeople);

    BigDecimal fillUp(int fuelQuantity);
}
