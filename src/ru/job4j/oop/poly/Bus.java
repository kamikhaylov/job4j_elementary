package ru.job4j.oop.poly;

import java.math.BigDecimal;

public class Bus implements Transport {
    @Override
    public void go() {
    }

    @Override
    public void passengers(int numberOfPeople) {
    }

    @Override
    public BigDecimal fillUp(int fuelQuantity) {
        BigDecimal price = new BigDecimal(0);
        return price;
    }
}
