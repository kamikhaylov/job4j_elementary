package ru.job4j.patterns.strategy.payment;

public class Card {
    private int amount;
    private String number;
    private String date;
    private String ccv;

    public Card (String number, String date, String ccv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.ccv = ccv;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
