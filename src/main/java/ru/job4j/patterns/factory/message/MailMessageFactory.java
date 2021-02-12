package ru.job4j.patterns.factory.message;

public class MailMessageFactory implements MessageFactory {
    @Override
    public Message createMessage() {
        return new MailMessage();
    }
}
