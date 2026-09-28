package se.sprinto.hakan.messagesender;

public class MessageService {
    private MessageSender sender;

    public MessageService(MessageSender sender) {
        this.sender = new ConsoleMessageSender();
    }

    public void sendMessage(String message) {
        sender.send(message);
    }

}
