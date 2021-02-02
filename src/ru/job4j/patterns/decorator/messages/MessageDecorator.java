package ru.job4j.patterns.decorator.messages;

public class MessageDecorator implements Message {

    private Message message;

    public MessageDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String send() {
        return message.send();
    }
}
