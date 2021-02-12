package ru.job4j.patterns.factory.message;

public class SMSMessage implements Message {
    @Override
    public void send() {
        System.out.println("Отправка СМС");
    }
}
