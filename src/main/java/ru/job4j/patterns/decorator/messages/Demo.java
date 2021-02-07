package ru.job4j.patterns.decorator.messages;

public class Demo {
    public static void main(String[] args) {
        Message message = new ChatMessage(new EmailMessage(new SMSMessage()));
        System.out.println(message.send());
        Message message1 = new EmailMessage(new ChatMessage(new SMSMessage()));
        System.out.println(message1.send());
    }
}
