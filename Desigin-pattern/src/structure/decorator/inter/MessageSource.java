package structure.decorator.inter;

public interface MessageSource {
  void writeMessage(String message);

  String readMessage();

  void sendMessage();
}
