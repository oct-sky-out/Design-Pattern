package structure.decorator.classes;

import structure.decorator.inter.MessageSource;

public class EmailDecorator extends MessageSourceDecorator {

    public EmailDecorator(MessageSource messageSource) {
        super(messageSource);
    }

    @Override
    public String readMessage() {
        return parseToHtml(super.readMessage());
    }

    @Override
    public void sendMessage() {
        System.out.println("Email : " + readMessage());
        super.sendMessage();
    }

    @Override
    public void writeMessage(String message) {
        super.writeMessage(message);
    }

    public String parseToHtml(String message) {
        return "<html>" + message + "</html>";
    }
}