package se.sprinto.hakan.messagesender;

import java.util.List;

public class Main {

    static void main() {
        //interface-typ till vänster    implementation till höger
        ConsoleMessageSender consoleSender = new ConsoleMessageSender();

        MessageSender fileMessageSender = new FileMessageSender();

        //MessageSender consoleSender = new ConsoleMessageSender();

        printMessage(consoleSender);
        printMessage(fileMessageSender);

        List<String> messages = List.of("One", "Two");

        for (int i = 0; i < messages.size() + 1; i++) {
            System.out.println(messages.get(i));
        }

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
