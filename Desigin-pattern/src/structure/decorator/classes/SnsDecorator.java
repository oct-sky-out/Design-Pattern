package structure.decorator.classes;

import structure.decorator.inter.MessageSource;

public class SnsDecorator extends MessageSourceDecorator {
    private final String username;

    public SnsDecorator(MessageSource messageSource, String username) {
        super(messageSource);
        this.username = username;
    }

    @Override
    public String readMessage() {
        return super.readMessage();
    }

    @Override
    public void sendMessage() {
        System.out.println("sns : " + readMessage());
        super.sendMessage();
    }

    @Override
    public void writeMessage(String message) {
        super.writeMessage(username + "!" + System.lineSeparator() + message);
    }

}
