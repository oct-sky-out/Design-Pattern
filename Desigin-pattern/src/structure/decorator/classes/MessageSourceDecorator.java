package structure.decorator.classes;

import structure.decorator.inter.MessageSource;

public class MessageSourceDecorator implements MessageSource {
    private final MessageSource messageSource;

    public MessageSourceDecorator(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void writeMessage(String message) {
        this.messageSource.writeMessage(message);
    }

    @Override
    public String readMessage() {
        return this.messageSource.readMessage();
    }

    @Override
    public void sendMessage() {
        this.messageSource.sendMessage();
    }
}