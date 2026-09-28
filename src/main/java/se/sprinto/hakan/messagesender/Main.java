package se.sprinto.hakan.messagesender;

public class Main {

    static void main() {
        //interface-typ till vänster    implementation till höger
        ConsoleMessageSender consoleSender = new ConsoleMessageSender();

        MessageSender fileMessageSender = new FileMessageSender();

        //MessageSender consoleSender = new ConsoleMessageSender();

        printMessage(consoleSender);
        printMessage(fileMessageSender);

        //printMessageToFile(fileMessageSender);

        MessageService service = new MessageService(fileMessageSender);
        service.sendMessage("Hej");
    }

    public static void printMessage(MessageSender sender) {
        sender.send("Hej");
    }

//    public static void printMessageToFile(FileMessageSender sender) {
//        sender.send("Hej");
//    }
}
