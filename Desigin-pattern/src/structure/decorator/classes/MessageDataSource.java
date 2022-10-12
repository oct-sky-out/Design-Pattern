package structure.decorator.classes;

import structure.decorator.inter.MessageSource;

public class MessageDataSource implements MessageSource {
    private String message;

    @Override
    public void writeMessage(String message) {
        this.message = message;
    }

    @Override
    public String readMessage() {
        return this.message;
    }

    @Override
    public void sendMessage() {
        System.out.println(this.message);
    }

}
