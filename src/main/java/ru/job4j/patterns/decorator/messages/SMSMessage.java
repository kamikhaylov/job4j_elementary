package ru.job4j.patterns.decorator.messages;

public class SMSMessage implements Message {
    @Override
    public String send() {
        return "Отправка уведомления по СМС";
    }
}
