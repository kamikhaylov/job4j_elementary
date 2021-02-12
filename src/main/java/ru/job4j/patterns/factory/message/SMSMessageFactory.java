package ru.job4j.patterns.factory.message;

public class SMSMessageFactory implements MessageFactory {
    @Override
    public Message createMessage() {
        return new SMSMessage();
    }
}
