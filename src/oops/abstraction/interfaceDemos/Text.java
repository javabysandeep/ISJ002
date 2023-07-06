package oops.abstraction.interfaceDemos;

public class Text implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("sending text");
    }

    @Override
    public String receiveMessage() {
        return "text";
    }
}
