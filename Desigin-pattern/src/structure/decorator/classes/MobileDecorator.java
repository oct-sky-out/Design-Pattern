package structure.decorator.classes;

import structure.decorator.inter.MessageSource;

public class MobileDecorator extends MessageSourceDecorator {

    public MobileDecorator(MessageSource messageSource) {
        super(messageSource);
    }

    @Override
    public String readMessage() {
        return super.readMessage();
    }

    @Override
    public void sendMessage() {
        System.out.println("Mobile : [Web 발신]");
        System.out.println(readMessage());
        super.sendMessage();
    }

    @Override
    public void writeMessage(String message) {
        super.writeMessage(message);
    }
}