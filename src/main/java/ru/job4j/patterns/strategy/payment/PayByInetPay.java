package ru.job4j.patterns.strategy.payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByInetPay implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    static {
        DATA_BASE.put("email@email.ru", "12345678");
        DATA_BASE.put("post@epost.ru", "qwerty");
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!signedIn) {
                System.out.println("Введите почтовый адрес пользователя");
                email = READER.readLine();
                System.out.println("Введите пароль");
                password = READER.readLine();
                if (verify()) {
                    System.out.println("Проверка данных прошла успешно");
                } else {
                    System.out.println("Неправильный адрес электронной почты или пароль");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verify() {
        setSignedIn(password.equals(DATA_BASE.get(email)));
        return signedIn;
    }


    @Override
    public boolean pay(int paymentAmount) {
        if (signedIn) {
            System.out.println("Оплата " + paymentAmount + " через InetPay");
        }
        return signedIn ? true : false ;
    }
}