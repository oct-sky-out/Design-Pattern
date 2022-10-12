package structure.decorator;

import structure.decorator.classes.EmailDecorator;
import structure.decorator.classes.MessageDataSource;
import structure.decorator.classes.MessageSourceDecorator;
import structure.decorator.classes.MobileDecorator;
import structure.decorator.classes.SnsDecorator;
import structure.decorator.inter.MessageSource;

public class Main {
    public static void main(String[] args) {
        MessageSource messageSource = new MessageDataSource();
        messageSource.writeMessage("Decorator Pattern~");

        MessageSourceDecorator decorator = new MobileDecorator(
                new EmailDecorator(
                        new SnsDecorator(messageSource, "oct-sky-out")));

        decorator.sendMessage();
    }
}
