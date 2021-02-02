package ru.job4j.patterns.decorator.messages;

public class ChatMessage extends MessageDecorator {
    public ChatMessage(Message message) {
        super(message);
    }

    public String sendChat() {
        return "Отправка уведомления в чат";
    }

    @Override
    public String send() {
        System.out.println(sendChat());
        return super.send();
    }
}
