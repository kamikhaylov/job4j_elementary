package ru.job4j.patterns.factory.message;

public class MailMessage implements Message {
    @Override
    public void send() {
        System.out.println("Отправка электронного письма");
    }
}
