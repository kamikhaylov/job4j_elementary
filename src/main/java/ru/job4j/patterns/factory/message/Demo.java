package ru.job4j.patterns.factory.message;

public class Demo {
    public static void main(String[] args) {
         MessageFactory messageFactory = createMessageByType("mail");
         Message message = messageFactory.createMessage();
         message.send();
    }

    static MessageFactory createMessageByType(String type) {
        if(type.equalsIgnoreCase("SMS")) {
            return new SMSMessageFactory();
        } else if(type.equalsIgnoreCase("mail")) {
            return new MailMessageFactory();
        } else {
            throw new RuntimeException(type + " не существует");
        }
    }
}
