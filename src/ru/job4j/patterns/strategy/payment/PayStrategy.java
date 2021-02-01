package ru.job4j.patterns.strategy.payment;

public interface PayStrategy {
    void collectPaymentDetails();
    boolean pay(int paymentAmount);
}
