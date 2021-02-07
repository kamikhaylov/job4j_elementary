package ru.job4j.patterns.strategy.payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCardPay implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private Card card;
    private String number;
    private String date;
    private String cvv;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Введите номер карты");
            number = READER.readLine();
            System.out.println("Введите срок действия карты 'mm/yy':");
            date = READER.readLine();
            System.out.println("Введите код CCV");
            cvv = READER.readLine();
            card = new Card(number, date, cvv);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
        }
        return cardIsPresent() ? true : false;
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}