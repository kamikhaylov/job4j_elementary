package ru.job4j.oop.inheritance.pizza;

public class PizzaExtraCheesaExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return super.name() + " + extra tomato";
    }
}
