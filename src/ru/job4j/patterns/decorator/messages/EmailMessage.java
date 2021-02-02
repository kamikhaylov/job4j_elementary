package ru.job4j.patterns.decorator.messages;

public class EmailMessage extends MessageDecorator {
    public EmailMessage(Message message) {
        super(message);
    }

    public String sendEmail() {
        return "Отправка уведомления по электронной почте";
    }

    @Override
    public String send() {
        return super.send() + "\n" + sendEmail();
    }
}