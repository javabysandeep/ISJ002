package oops.abstraction.interfaceDemos;

public class MessageServiceImpl implements MessageService {
    String message;

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println("Message sent " + message);
    }

    @Override
    public String receiveMessage() {
        return message;
    }
}
