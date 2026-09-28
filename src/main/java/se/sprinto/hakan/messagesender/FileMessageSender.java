package se.sprinto.hakan.messagesender;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileMessageSender implements MessageSender {
    @Override
    public void send(String message) {
        Path file = Path.of("messages.txt");
        try {
            Files.writeString(file, message, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
