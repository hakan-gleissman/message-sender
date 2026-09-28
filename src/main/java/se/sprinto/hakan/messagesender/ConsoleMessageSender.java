package se.sprinto.hakan.messagesender;

public class ConsoleMessageSender implements MessageSender {
    @Override
    public void send(String message) {
        IO.println(message);
    }
}
